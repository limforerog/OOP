public class CuentaBancaria {
    // Atributo privado, solo tiene acceso desde esta clase
    private double saldo;

    // Implementé un constructor público para inicializar la cuenta bancaria
    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Uso de un método público para obtener el saldo (getter)
    public double getSaldo() {
        return saldo;
    }
      // Uso de un método público para depositar dinero (setter)
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }

    // Uso de método público para retirar dinero (setter)
    public boolean retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -=cantidad;
            return true;
        }
        return false;
    }
}
