public class Main {

    public static void main(String[] args) {
        // Creamos un objeto de la clase Operations para realizar las operaciones
        Operations resultado = new Operations();

        // Realizamos la operación de suma con los números 3 y 2
        resultado.sumar(3, 2);
        // Imprimimos el resultado de la suma en la consola
        System.out.println(resultado.r);

        // Realizamos la operación de resta con los números 10 y 5
        resultado.restar(10, 5);
        // Imprimimos el resultado de la resta en la consola
        System.out.println(resultado.r);

        // Realizamos la operación de multiplicación con los números 2 y 2
        resultado.multiplicar(2, 2);
        // Imprimimos el resultado de la multiplicación en la consola
        System.out.println(resultado.r);

        // Realizamos la operación de potencia con base 2 y exponente 4
        resultado.potencia(2, 4);
        // Imprimimos el resultado de la potencia en la consola
        System.out.println(resultado.r);
    }
}
