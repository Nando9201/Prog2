package Aufgabe18;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class LaufFrame extends JFrame {
    ColorRunButton knopf1, knopf2;
    JComboBox farbenWahl;
    JCheckBox buchstabenWahl;
    public LaufFrame() {


        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new java.awt.GridLayout(3, 1));
        JPanel panel = new JPanel();

        knopf1 = new ColorRunButton();
        knopf1.addActionListener(new KnopfListener(knopf1));
        knopf2 = new ColorRunButton();
        knopf2.addActionListener(new KnopfListener(knopf2));

        panel.add(knopf1);
        panel.add(knopf2);

        farbenWahl = new JComboBox(new String[]{"schwarze Schrift", "graue Schrift"});
        buchstabenWahl = new JCheckBox("Buchstaben");

        add(panel);
        add(farbenWahl);
        add(buchstabenWahl);

    }
    class KnopfListener implements ActionListener {
        ColorRunButton crb;
        KnopfListener (ColorRunButton crb) {
            this.crb = crb;
        }
        public void actionPerformed (ActionEvent e) {
            // Auswahl-Index des ComboBox-Objekts bestimmen und Schrift setzen
            var test = farbenWahl.getSelectedIndex();
            if (test == 0) {
                crb.setForeground(Color.BLACK);
            } else {
                crb.setForeground(Color.GRAY);
            }
            crb.change(buchstabenWahl.isSelected());

 }
    } }
