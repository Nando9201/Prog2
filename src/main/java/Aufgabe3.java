import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aufgabe3 {
    JPanel prot, pgelb, pgruen;
    public Aufgabe3() {
        JFrame frame = new JFrame("Ampel");

        frame.setSize(500, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new java.awt.GridLayout(3, 3));

        JCheckBox rot = new JCheckBox("Rot");
        rot.addActionListener( new ClickListener() );
        JCheckBox gelb = new JCheckBox("Gelb");
        gelb.addActionListener( new ClickListener() );
        JCheckBox gruen = new JCheckBox("Gruen");
        gruen.addActionListener( new ClickListener() );
        ButtonGroup group = new ButtonGroup();
        group.add(rot);
        group.add(gelb);
        group.add(gruen);

        prot = new JPanel();
        prot.setBackground(Color.black);
        pgelb = new JPanel();
        pgelb.setBackground(Color.black);
        pgruen = new JPanel();
        pgruen.setBackground(Color.black);

        frame.add(rot);
        frame.add(prot);
        frame.add(gelb);
        frame.add(pgelb);
        frame.add(gruen);
        frame.add(pgruen);

        frame.setVisible(true);
    }

    class ClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            prot.setBackground(Color.black);
            pgelb.setBackground(Color.black);
            pgruen.setBackground(Color.black);

            var cb = (JCheckBox)e.getSource();
            var name = cb.getText();
            switch (name)
            {
                case "Rot":
                    prot.setBackground(Color.red);
                    break;
                case "Gelb":
                    pgelb.setBackground(Color.yellow);
                    break;
                case "Gruen":
                    pgruen.setBackground(Color.green);
                    break;
            }

        }
    }

}
