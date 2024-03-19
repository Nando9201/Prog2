package Aufgabe17;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aufgabe17 {
    ColorRunLabel rot, gelb, gruen;

    StartStopButton BTNrot, BTNgelb, BTNgruen;

    public Aufgabe17() {
        JFrame frame = new JFrame("FunktionsFrame");

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new java.awt.GridLayout(2, 3));

        rot = new ColorRunLabel(Color.RED);
        frame.add(rot);
        gelb = new ColorRunLabel(Color.YELLOW);
        frame.add(gelb);
        gruen = new ColorRunLabel(Color.GREEN);
        frame.add(gruen);

        BTNrot = new StartStopButton(Color.RED);
        BTNrot.addActionListener(new BTNclicked(rot, BTNrot));
        frame.add(BTNrot);
        BTNgelb = new StartStopButton(Color.YELLOW);
        BTNgelb.addActionListener(new BTNclicked(gelb, BTNgelb));
        frame.add(BTNgelb);
        BTNgruen = new StartStopButton(Color.GREEN);
        BTNgruen.addActionListener(new BTNclicked(gruen, BTNgruen));
        frame.add(BTNgruen);

        frame.setVisible(true);


    }

    class BTNclicked implements ActionListener {

        ColorRunLabel label;
        StartStopButton button;

        public BTNclicked(ColorRunLabel label, StartStopButton button) {
            this.label = label;
            this.button = button;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (button.isStart()) {
                label.start();
                button.switchText();
            } else {
                label.stop();
                button.switchText();
            }
        }
    }
}
