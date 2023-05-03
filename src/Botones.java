import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

public class Botones extends JFrame implements ActionListener {
    JButton b1, b2, b3, b4;

    public Botones() {
        super("Ejemplo de Layout");
        // BorderLayout
        setLayout(new BorderLayout(5, 10));
        // b1 = new JButton("boton 1");

        b1 = new JButton("boton1", new ImageIcon("jesus.gif"));
        // b1.setText("Boton1");
        // b1.setIcon(icono);

        b1.addActionListener(this);
        add(b1, BorderLayout.EAST);

        b2 = new JButton("boton 2");
        b2.addActionListener(this);
        add(b2, BorderLayout.SOUTH);

        b3 = new JButton("boton 3");
        b3.addActionListener(this);
        add(b3, BorderLayout.WEST);

        b4 = new JButton("boton 4");
        b4.addActionListener(this);
        add(b4, BorderLayout.NORTH);

        add(new JButton(""), BorderLayout.CENTER);
        setSize(200, 200); // pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Botones();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getSource().toString());
        String nombre = "";

        if (e.getSource() == b1)
            nombre = "Boton 1";
        if (e.getSource() == b2)
            nombre = "Boton 2";
        if (e.getSource() == b3)
            nombre = "Boton 3";
        if (e.getSource() == b4)
            nombre = "Boton 4";

        JFrame j = new JFrame(nombre);
        j.setVisible(true);
        j.setSize(100, 100);

        j.setDefaultCloseOperation(EXIT_ON_CLOSE);
        j.add(new JLabel(nombre));

        // TODO Auto-generedOperationException("Unimplemented method
        // 'actionPerformed'");
    }

}