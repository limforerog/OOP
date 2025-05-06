import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Clase principal del programa con la interfaz gráfica
public class main {
    public static void main(String[] args) {
        // Crear una instancia de la interfaz gráfica
        JFrame frame = new JFrame("Operaciones Matemáticas");
        frame.setSize(300, 200);  // Definir el tamaño de la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Crear los componentes de la interfaz
        JLabel label1 = new JLabel("Ingrese el primer número:");
        label1.setBounds(20, 20, 180, 30);
        JTextField textField1 = new JTextField();
        textField1.setBounds(180, 20, 80, 30);

        JLabel label2 = new JLabel("Ingrese el segundo número:");
        label2.setBounds(20, 60, 180, 30);
        JTextField textField2 = new JTextField();
        textField2.setBounds(180, 60, 80, 30);

        JButton sumButton = new JButton("Sumar");
        sumButton.setBounds(20, 100, 80, 30);

        JButton subtractButton = new JButton("Restar");
        subtractButton.setBounds(110, 100, 80, 30);

        JButton multiplyButton = new JButton("Multiplicar");
        multiplyButton.setBounds(200, 100, 100, 30);

        JLabel resultLabel = new JLabel("Resultado:");
        resultLabel.setBounds(20, 140, 180, 30);

        // Añadir los componentes al marco
        frame.add(label1);
        frame.add(textField1);
        frame.add(label2);
        frame.add(textField2);
        frame.add(sumButton);
        frame.add(subtractButton);
        frame.add(multiplyButton);
        frame.add(resultLabel);

        // Mostrar la ventana
        frame.setVisible(true);

        // Acción para el botón de Sumar
        sumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(textField1.getText());
                    int num2 = Integer.parseInt(textField2.getText());

                    Operations operacion = new Operations(num1, num2);
                    operacion.sumar();

                    resultLabel.setText("Resultado: " + operacion.getResult());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Por favor, ingrese números válidos.");
                }
            }
        });

        // Acción para el botón de Restar
        subtractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(textField1.getText());
                    int num2 = Integer.parseInt(textField2.getText());

                    Operations operacion = new Operations(num1, num2);
                    operacion.restar();

                    resultLabel.setText("Resultado: " + operacion.getResult());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Por favor, ingrese números válidos.");
                }
            }
        });

        // Acción para el botón de Multiplicar
        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(textField1.getText());
                    int num2 = Integer.parseInt(textField2.getText());

                    Operations operacion = new Operations(num1, num2);
                    operacion.multiplicar();

                    resultLabel.setText("Resultado: " + operacion.getResult());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Por favor, ingrese números válidos.");
                }
            }
        });
    }
}
