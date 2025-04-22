public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicita el primer número al usuario
            System.out.print("Ingrese el primer número: ");
            int numero1 = scanner.nextInt();

            // Solicita el segundo número al usuario
            System.out.print("Ingrese el segundo número: ");
            int numero2 = scanner.nextInt();

            // Crea una nueva operación con los números ingresados
            Operations operacion = new Operations(numero1, numero2);

            // Muestra los resultados en pantalla
            System.out.println("Suma: " + operacion.sumar());
            System.out.println("Resta: " + operacion.restar());
            System.out.println("Multiplicación: " + operacion.multiplicar());
        }        
    }
}

