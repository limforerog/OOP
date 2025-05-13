import javax.swing.*;
import java.awt.*;

public class CajeroGUI extends JFrame {
    // Objeto privado de tipo CuentaBancaria
    private CuentaBancaria cuenta;

    // Componentes gráficos de tipo privado
    private JLabel labelSaldo;
    private JButton btnDepositar, btnRetirar, btnSalir;

    public CajeroGUI() {
        cuenta = new CuentaBancaria(100000); // Creamos la cuenta con saldo inicial que debe ser a favor, no negativo 

        setTitle("Bienvenido a Cajero Automático ATM");
        setSize(360, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Inicialización de componentes
        labelSaldo = new JLabel("Saldo actual: $" + cuenta.getSaldo());
        btnDepositar = new JButton("Depositar");
        btnRetirar = new JButton("Retirar");
        btnSalir = new JButton("Salir");

        add(labelSaldo);
        add(btnDepositar);
        add(btnRetirar);
        add(btnSalir);

        // Acciones de los botones
        btnDepositar.addActionListener(e -> {
            String input = JOptionPane.showInputDialog("Digite la cantidad a depositar:");
            if (input != null) {
                try {
                    double cantidad = Double.parseDouble(input);
                    cuenta.depositar(cantidad);  // Acceso a método público
                    actualizarSaldo();
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Entrada no válida.");
                }
            }
        });

        btnRetirar.addActionListener(e -> {
            String input = JOptionPane.showInputDialog("Digite la cantidad a retirar:");
            if (input != null) {
                try {
                    double cantidad = Double.parseDouble(input);
                    if (cuenta.retirar(cantidad)) {
                        actualizarSaldo();
                    } else {
                        JOptionPane.showMessageDialog(null, "Fondos insuficientes.");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Entrada no válida, digite un número.");
                }
            }
        });

        btnSalir.addActionListener(e -> System.exit(0));

        setVisible(true);
    }

    // Método privado para actualizar el saldo mostrado
    private void actualizarSaldo() {
        labelSaldo.setText("Saldo actual: $" + cuenta.getSaldo());
    }

    // Método principal (este es el punto de entrada del programa)
    public static void main(String[] args) {
        new CajeroGUI();
    }
}
  