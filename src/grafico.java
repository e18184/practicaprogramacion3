import javax.swing.*;

public class grafico {
    public static void main(String args[]) {
        JFrame f = new JFrame("Ejemplo");
        f.setSize(100, 100);
        JLabel l = new JLabel("Hola");
        f.getContentPane().add(l);
        f.show();
        try {
            System.in.read();
        } catch (Exception e) {

        }

    }
}
