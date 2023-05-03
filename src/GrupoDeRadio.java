import javax.swing.*;
import java.awt.BorderLayout;

public class GrupoDeRadio extends JFrame {
    ButtonGroup bg;
    JRadioButton j1, j2;

    GrupoDeRadio() {
        super("Ejemplo de Radio Button");
        bg = new ButtonGroup();
        setLayout(new BorderLayout(5, 10));
        // add(new JLabel("hombre"));
        j1 = new JRadioButton("mensaje hombre");
        add(j1, BorderLayout.SOUTH);
        bg.add(j1);

        // add(new JLabel("mujer"));
        j2 = new JRadioButton("mensaje mujer");
        add(j2, BorderLayout.NORTH);
        bg.add(j2);
        setSize(200, 200); // pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new GrupoDeRadio();
    }

}
