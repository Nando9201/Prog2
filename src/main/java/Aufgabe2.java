import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Aufgabe2 extends JFrame{

    String zeitDefault = "Datum und Uhrzeit: ";

    public static final SimpleDateFormat[] formate = {
            new SimpleDateFormat("HH:mm:ss"),
            new SimpleDateFormat("dd.MM.yyyy HH:mm"),
            new SimpleDateFormat("dd.MM.yyyy HH:mm:ss")};

    public static int gewaehlt = 1;

    public Aufgabe2() {
        JFrame frame = new JFrame("Zeitangabe");

        frame.setSize(500, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new java.awt.GridLayout(3, 1));

        String[] auswahl = {"Tag, Datum und Uhrzeit", "Datum und Uhrzeit mit Sekunden", "Datum mit Jahr und Uhrzeit"};
        JComboBox comboBox = new JComboBox(auswahl);
        comboBox.setSelectedIndex(gewaehlt);
        comboBox.addActionListener(new AnzeigeListener());
        frame.add(comboBox);

        JLabel label = new JLabel(zeitDefault);
        frame.add(label);

        JButton button = new JButton("Anzeige aktualisieren");
        button.addActionListener(new KnopfHorcher(label));
        frame.add(button);

        frame.setVisible(true);

    }

    class AnzeigeListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JComboBox cb = (JComboBox)e.getSource();
            gewaehlt = cb.getSelectedIndex();
        }
    }

}
