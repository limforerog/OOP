public class Operations {
    
    public int a, b, r; // Variables que guardan los números y el resultado de la operación
    
    // Método para realizar la suma de dos números
    public int sumar(int a, int b) {
        r = a + b; // Guarda el resultado de la suma en la variable 'r'
        return a + b; // Retorna el resultado de la suma
    }

    // Método para realizar la resta de dos números
    public int restar(int a, int b) {
        r = a - b; // Guarda el resultado de la resta en la variable 'r'
        return a - b; // Retorna el resultado de la resta
    }

    // Método para realizar la multiplicación de dos números
    public int multiplicar(int a, int b) {
        r = a * b; // Guarda el resultado de la multiplicación en la variable 'r'
        return a * b; // Retorna el resultado de la multiplicación
    }

    // Método para calcular la potencia de un número
    public int potencia(int base, int exponente) {
        // Si el exponente es 0, el resultado es 1 (porque cualquier número elevado a 0 es 1)
        // Si no, se llama recursivamente para calcular la potencia
        r = exponente == 0 ? 1 : base * potencia(base, exponente - 1);
        return exponente == 0 ? 1 : base * potencia(base, exponente - 1); // Retorna el valor de la potencia
    }
}
