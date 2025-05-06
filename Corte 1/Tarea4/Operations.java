// Clase que contiene los métodos para hacer operaciones matemáticas
class Operations {
    private int num1; // Primer número
    private int num2; // Segundo número
    private int result;

    // Constructor: se ejecuta cuando se crea un objeto y guarda los números
    public Operations(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Métodos para realizar las operaciones matemáticas
    public void sumar() {
        result = num1 + num2;
    }

    public void restar() {
        result = num1 - num2;
    }

    public void multiplicar() {
        result = num1 * num2;
    }

    // Método para obtener el resultado
    public int getResult() {
        return result;
    }
}