package Aufgabe18;

import java.awt.*;
import java.util.Random;
import javax.swing.*;

public class ColorRunButton extends JButton implements Runnable {
    private boolean running = false; // Thread la ̈uft zu Beginn nicht
    private boolean zeigtBuchstabe = true; // Anzeige zeigt zu Beginn Buchstaben

    public ColorRunButton() {
        super();
        setBackground(Color.white);
        setFont(new Font("Arial", Font.BOLD, 50));
        setText("  ");
    }

    public void change(boolean zeigtBuchstabe) {
        this.zeigtBuchstabe = zeigtBuchstabe;
        if (running) {
            running = false;
        } else {
            running = true;
            Thread t = new Thread(this);
            t.start();
        }
    }

    public void run() {
        String buchstaben = "ABCDEFGHIJ";
        Random rnd = new Random();

        String text;
        while (running) {
            if (zeigtBuchstabe) {
                setText("" + buchstaben.charAt(rnd.nextInt(buchstaben.length())));
            } else {
                setText("" + rnd.nextInt(10));
            }

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}