package Aufgabe17;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class ColorRunLabel extends JLabel implements Runnable {

    Boolean running;

    ColorRunLabel(Color background) {
        super("0", SwingConstants.CENTER);
        setBackground(background);
        setOpaque(true);
        setFont(new Font("Arial", Font.BOLD, 50));

    }

    void start() {
        this.running = true;
        Thread t = new Thread(this);
        t.start();
    }
    void stop() {
        this.running = false;
    }
    @Override
    public void run() {
        Random rnd = new Random();

        while (running) {
            this.setText("" + rnd.nextInt(0, 10));
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }
    }
}
