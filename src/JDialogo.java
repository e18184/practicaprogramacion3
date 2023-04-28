import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/* ActionListener */
public class JDialogo implements ActionListener {
    JFrame frame;
    JButton b1, b2;

    public JDialogo() {
        frame = new JFrame("Marco");
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JPanel panel = new JPanel();
        frame.add(panel);

        b1 = new JButton("Click");
        b1.addActionListener(this);

        panel.add(b1);
        b2 = new JButton("Click");
        b2.addActionListener(this);
        panel.add(b2);

    }

    public static void main(String[] args) {
        new JDialogo();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            System.out.println("boton 1");

        } else if (e.getSource() == b2) {
            System.out.println("boton 2");

        }

        System.out.println("Se hizo un click");

        JDialog d = new JDialog(frame, "Dialogo");
        d.setSize(200, 200);
        d.setVisible(true);
        d.add(new JLabel("Este es un dialogo"));

    }
}