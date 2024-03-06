import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aufgabe5 {

    public Aufgabe5() {
        JFrame frame = new JFrame("Euro-Rechner");

        frame.setSize(500, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new java.awt.GridLayout(4, 1));

        JLabel euro = new JLabel("Euro");
        frame.add(euro);

        JTextField euroField = new JTextField();

        frame.add(euroField);

        String[] Werte = new String[11];
        for (int i = 0; i < 11; i++) {
            Werte[i] = EuroConverter.getBezeichnung(i);
        }
        JComboBox comboBox = new JComboBox(Werte);
        frame.add(comboBox);

        JTextField result = new JTextField("?");
        frame.add(result);

        euroField.addActionListener(new RechnerListener(euroField, comboBox, result, "EURO"));
        comboBox.addActionListener(new RechnerListener(euroField, comboBox, result, "EURO"));
        result.addActionListener(new RechnerListener(euroField, comboBox, result, "TOEURO"));

        frame.setVisible(true);
    }

    class RechnerListener implements ActionListener {
        JTextField euroField, resultField;
        JComboBox comboBox;

        String operation;

        RechnerListener(JTextField euroField, JComboBox comboBox, JTextField resultField, String operation) {
            this.euroField = euroField;
            this.comboBox = comboBox;
            this.resultField = resultField;
            this.operation = operation;
        }

        public void actionPerformed(ActionEvent e) {
            if (operation.equals("EURO")) {
                String text = euroField.getText();
                if (text.length() > 0) {
                    int index = comboBox.getSelectedIndex();
                    double betrag = Double.parseDouble(text);
                    double result = EuroConverter.convertFromEuro(betrag, index);
                    resultField.setText(String.valueOf(result));
                }
            } else if (operation.equals("TOEURO")) {
                String text = resultField.getText();
                if (text.length() > 0) {
                    int index = comboBox.getSelectedIndex();
                    double betrag = Double.parseDouble(text);
                    double result = EuroConverter.convertToEuro(betrag, index);
                    euroField.setText(String.valueOf(result));
                }
            }
        }
    }

}
