import javax.swing.*;
import java.awt.Font;

public class grafico {
    public static void main(String args[]) {
        JFrame f = new JFrame("Ejemplo");

        f.setSize(500, 500);
        // 1024 x 768
        f.setLocation(1024 / 2, 768 / 2);
        JLabel l = new JLabel();
        Font fuente = new Font("Serif", Font.ITALIC, 50);

        l.setFont(fuente);

        l.setText(("tamano texto:" + l.getFont().getSize() + " nombre de la fuente: " +
                l.getFont().getFontName()));

        f.getContentPane().add(l);

        f.show();
        try {
            System.in.read();
        } catch (Exception e) {

        }

    }
}
