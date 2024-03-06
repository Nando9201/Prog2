import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Aufgabe1 {
static JPanel panel;
    public Aufgabe1() {

        JFrame frame = new JFrame("Black and White");
        frame.setVisible(true);
        frame.setSize(250, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        frame.add(panel);
        JButton button = new JButton("Drueck mich!");

        button.addActionListener(new ButtonBearbeiter());
        panel.addMouseListener(new MausBearbeiter());

        panel.add(button);

    }
}

class ButtonBearbeiter implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Aufgabe1.panel.setBackground( Color.black );
    }
}
class MausBearbeiter implements MouseListener {
    @Override
    public void mouseClicked(MouseEvent e) {
        Aufgabe1.panel.setBackground(Color.WHITE);
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}