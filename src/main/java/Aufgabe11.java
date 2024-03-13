import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aufgabe11 {


    public Aufgabe11() {
        JFrame frame = new JFrame("FunktionsFrame");

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new java.awt.GridLayout(2, 3));

        JLabel label = new JLabel("Argument");
        frame.add(label);

        JCheckBox checkBox = new JCheckBox("Logarithmus");
        frame.add(checkBox);

        JButton button = new JButton("Berechnen");

        frame.add(button);

        JTextField input = new JTextField("input");
        frame.add(input);

        JCheckBox checkBox2 = new JCheckBox("Quadrat");
        frame.add(checkBox2);

        ButtonGroup group = new ButtonGroup();
        group.add(checkBox);
        group.add(checkBox2);

        JTextField result = new JTextField("result");
        frame.add(result);


        button.addActionListener(new FunktionsListener(input, checkBox, checkBox2, result));
        frame.setVisible(true);
    }

    class FunktionsListener implements ActionListener {
        JTextField inputField, resultField;
        JCheckBox checkBox, checkBox2;

        FunktionsListener(JTextField inputField, JCheckBox checkBox, JCheckBox checkBox2, JTextField resultField) {
            this.inputField = inputField;
            this.checkBox = checkBox;
            this.checkBox2 = checkBox2;
            this.resultField = resultField;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            String text = inputField.getText();
            if (text.length() > 0) {
                double betrag = Double.parseDouble(text);
                if (checkBox.isSelected()) {
                    double result = Math.log(betrag);
                    resultField.setText(String.valueOf(result));
                } else if (checkBox2.isSelected()) {
                    double result = betrag * betrag;
                    resultField.setText(String.valueOf(result));
                }
            }
        }

    }
}
