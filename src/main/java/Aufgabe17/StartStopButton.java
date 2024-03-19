package Aufgabe17;

import javax.swing.*;
import java.awt.*;

public class StartStopButton extends JButton {
    StartStopButton(Color background) {
        super();
        setBackground(background);
        setBorderPainted(false);
        setOpaque(true);

        setFont(new Font("Arial", Font.PLAIN, 25));
        setText("Start");
    }

    Boolean isStart(){
        return getText().equals("Start");
    }
    void switchText(){
        if (isStart()){
            setText("Stop");
        } else {
            setText("Start");
        }
    }
}

