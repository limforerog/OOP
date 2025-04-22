public class Operations {
    private Data data; // Options se almacena en data
    
    //Brindar constructores
    public Operations() {
        data = new Data(); // inicializo Data
    }

    // Operaciones
    public void sumar(int a, int b) {
        data.setResultado(a + b); // uso data para almacenar el resultado
    }

    public void restar(int a, int b) {
        data.setResultado(a - b);//igual aqui 
    }

    public void multiplicar(int a, int b) {
        data.setResultado(a * b);
    }
   // public void potencia(int base, int exponente) {
       // data.setResultado((exponente == 0 ? 1 : base * potencia(base, exponente - 1));
   // }

    // Resultado 
    public int getResultado() {
        return data.getResultado();
    }
}
