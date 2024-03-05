import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Aufgabe1 {

    public Aufgabe1() {

        JFrame frame = new JFrame("Black and White");
        frame.setVisible(true);
        frame.setSize(500, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        JButton button = new JButton("Drueck mich!");

        button.addActionListener(new ButtonBearbeiter(panel));
        panel.addMouseListener(new MausBearbeiter(panel));

        panel.add(button);

    }
}

class ButtonBearbeiter implements ActionListener {
    JPanel panel;
    ButtonBearbeiter(JPanel panel) {
        this.panel = panel;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        panel.setBackground( Color.black );
    }
}
class MausBearbeiter implements MouseListener {
    JPanel panel;
    MausBearbeiter (JPanel panel){
        this.panel = panel;
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        panel.setBackground(Color.WHITE);
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