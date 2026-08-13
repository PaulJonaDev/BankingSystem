
public class CuentaBancaria {
    private String numeroCuenta;
    private String titular;
    private double saldo;

    // Constructor
    public CuentaBancaria(String numeroCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    // Getters
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    // Setter protegido: permito que solo las clases hijas cambien el saldo directo
    protected void setSaldo(double nuevoSaldo) {
        this.saldo = nuevoSaldo;
    }

    // Métodos a sobreescribir o extender
    public String describir() {
        return "Cuenta [" + numeroCuenta + "] - Titular: [" + titular + "] - Saldo: $" + saldo;
    }

    public double calcularComision() {
        return 0.0;
    }

    public void realizarRetiro(double monto) {
        setSaldo(this.saldo - monto);
    }
}