import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aufgabe4 {
    public Aufgabe4 () {
        JFrame frame = new JFrame("Rechner");

        frame.setSize(500, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new java.awt.GridLayout(2, 5));

        JTextField zahl1 = new JTextField();
        frame.add(zahl1);

        JLabel calc = new JLabel("?");
        calc.setHorizontalAlignment(JLabel.CENTER);
        frame.add(calc);

        JTextField zahl2 = new JTextField();
        frame.add(zahl2);

        JLabel equals = new JLabel("=");
        equals.setHorizontalAlignment(JLabel.CENTER);
        frame.add(equals);

        JTextField result = new JTextField();
        result.setEditable(false);
        frame.add(result);

        JButton plus = new JButton("+");
        plus.addActionListener(new RechnerListener(zahl1, zahl2, result, "+"));
        frame.add(plus);

        JButton minus = new JButton("-");
        minus.addActionListener(new RechnerListener(zahl1, zahl2, result, "-"));
        frame.add(minus);

        JButton mal = new JButton("*");
        mal.addActionListener(new RechnerListener(zahl1, zahl2, result, "*"));
        frame.add(mal);

        JButton geteilt = new JButton("/");
        geteilt.addActionListener(new RechnerListener(zahl1, zahl2, result, "/"));
        frame.add(geteilt);

        JButton clear = new JButton("C");
        clear.addActionListener(new RechnerListener(zahl1, zahl2, result, "1"));
        frame.add(clear);

        frame.setVisible(true);

    }

    class RechnerListener implements ActionListener {
        JTextField zahl1, zahl2, result;
        String operation;
        RechnerListener(JTextField zahl1, JTextField zahl2, JTextField result, String operation) {
            this.zahl1 = zahl1;
            this.zahl2 = zahl2;
            this.result = result;
            this.operation = operation;
        }
        public void actionPerformed(ActionEvent e) {
            if (operation.equals("1")) {
                zahl1.setText("");
                zahl2.setText("");
                result.setText("");
                return;
            }
            double z1 = Double.parseDouble(zahl1.getText());
            double z2 = Double.parseDouble(zahl2.getText());
            double res = 0;
            switch (operation) {
                case "+":
                    res = z1 + z2;
                    break;
                case "-":
                    res = z1 - z2;
                    break;
                case "*":
                    res = z1 * z2;
                    break;
                case "/":
                    res = z1 / z2;
                    break;
            }
            result.setText(Double.toString(res));
        }
    }
}
