import javax.swing.*;
import javax.swing.event.ChangeEvent;
import java.awt.GridLayout;
import javax.swing.event.ChangeListener;

class PanelDatos extends JFrame implements ChangeListener {

    public PanelDatos() {
        setLayout(new GridLayout(4, 2));
        JLabel etiquetaNombre = new JLabel("Nombre: ", JLabel.RIGHT);
        JTextField campoNombre = new JTextField();
        add(etiquetaNombre);
        add(campoNombre);
        JLabel etiquetaApellidos = new JLabel("Apellidos:", JLabel.RIGHT);
        JTextField campoApellidos = new JTextField();
        add(etiquetaApellidos);
        add(campoApellidos);
        JLabel etiquetaNP = new JLabel("Número Personal:", JLabel.RIGHT);
        JTextField campoNP = new JTextField();
        add(etiquetaNP);
        add(campoNP);

        ButtonGroup grupoBotones = new ButtonGroup();
        JRadioButton mañana = new JRadioButton("Grupo Mañana", true);
        JRadioButton tarde = new JRadioButton("Grupo Tarde");
        grupoBotones.add(mañana);
        grupoBotones.add(tarde);
        add(mañana);
        add(tarde);
        initPantalla();
    }

    private void initPantalla() {

        setLayout(null); // Layout absoluto
        setTitle("Ejemplo "); // Título del JFrame
        setSize(550, 430); // Dimensiones del JFrame
        setResizable(true); // No redimensionable
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cerrar proceso al cerrar ventana
        setVisible(true); // Mostrar JFrame
    }

    public static void main(String[] args) {
        new PanelDatos();
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'stateChanged'");
    }
}