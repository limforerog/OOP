import java.util.Scanner;

// Clase principal del programa
public class Main {
    public static void main(String[] args) {
        // Usamos Scanner para leer los números que el usuario escriba
        try (Scanner scanner = new Scanner(System.in)) {
            // Pedimos el primer número
            System.out.print("Ingrese el primer número: ");
            int numero1 = scanner.nextInt();

            // Pedimos el segundo número
            System.out.print("Ingrese el segundo número: ");
            int numero2 = scanner.nextInt();

            // Creamos un objeto de la clase Operations y le pasamos los dos números
            Operations operacion = new Operations(numero1, numero2);

            // Mostramos los resultados de las operaciones matemáticas básicas
            System.out.println("Suma: " + operacion.sumar());
            System.out.println("Resta: " + operacion.restar());
            System.out.println("Multiplicación: " + operacion.multiplicar());
        }        
    }
}
java
Copy
Edit
// Clase que contiene los métodos para hacer operaciones matemáticas
public class Operations {
    private int num1; // Primer número
    private int num2; // Segundo número

    // Constructor: se ejecuta cuando se crea un objeto y guarda los números
    public Operations(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Métodos para obtener o cambiar los valores de num1 y num2 si es necesario
    public int getNum1() { return num1; }
    public void setNum1(int num1) { this.num1 = num1; }

    public int getNum2() { return num2; }
    public void setNum2(int num2) { this.num2 = num2; }

    // Método que suma los dos números
    public int sumar() {
        return num1 + num2;
    }

    // Método que resta el segundo número al primero
    public int restar() {
        return num1 - num2;
    }

    // Método que multiplica los dos números
    public int multiplicar() {
        return num1 * num2;
    }
}
