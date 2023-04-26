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

    public JDialogo() {
        frame = new JFrame("Marco");
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JPanel panel = new JPanel();
        frame.add(panel);

        JButton b1 = new JButton("Click");
        b1.addActionListener(this);

        panel.add(b1);

    }

    public static void main(String[] args) {
        new JDialogo();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Se hizo un click");

        JDialog d = new JDialog(frame, "Dialogo");
        d.setSize(200, 200);
        d.setVisible(true);
        d.add(new JLabel("Este es un dialogo"));

    }
}