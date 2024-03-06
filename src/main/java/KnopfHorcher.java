import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class KnopfHorcher implements ActionListener {
    JLabel label;
    KnopfHorcher(JLabel label) {
        this.label = label;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        label.setText("Datum und Uhrzeit: " + Aufgabe2.formate[Aufgabe2.gewaehlt].format(new Date()));
    }
}
