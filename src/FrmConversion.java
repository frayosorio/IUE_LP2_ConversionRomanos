import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class FrmConversion extends JFrame {

    public FrmConversion() {
        setSize(300, 200); // tamaño de la ventana
        setTitle("Conversión a Romanos"); // asignar un titulo
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // salir del programa al cerrar

        setLayout(null); // anular diseño

        JLabel lblNumero = new JLabel("Número arábigo"); // creando una etiqueta
        lblNumero.setBounds(10, 10, 100, 25); // ubicacion y dimensiones de la etiqueta
        this.getContentPane().add(lblNumero);

        JTextField txtNumero = new JTextField(); // creando una caja de texto
        txtNumero.setBounds(110, 10, 100, 25); // ubicacion y dimensiones de la etiqueta
        this.getContentPane().add(txtNumero);

        JTextField txtRomano = new JTextField(); // creando una caja de texto
        txtRomano.setBounds(110, 40, 100, 25); // ubicacion y dimensiones de la etiqueta
        txtRomano.setEnabled(false);
        this.getContentPane().add(txtRomano);

        JButton btnCalcular = new JButton("A Romano");
        btnCalcular.setBounds(10, 40, 100, 25);
        getContentPane().add(btnCalcular);
    }

}
