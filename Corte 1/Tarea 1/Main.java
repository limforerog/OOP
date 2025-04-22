public class Main {

    public static void main(String[] args) {
    
     Operations resultado = new Operations();
     resultado.sumar(3,2);
     System.out.println(resultado.r);
     
     resultado.restar(10,5);
     System.out.println(resultado.r);
     
     resultado.multiplicar(2, 2);
     System.out.println(resultado.r);
     
     resultado.potencia(2,4);
     System.out.println(resultado.r);
    }
}
