public class CuentaAhorros extends CuentaBancaria {
    private double tasaInteresMensual;
    private double saldoMinimo;

    // Armo mi  Constructor
    public CuentaAhorros(String numeroCuenta, String titular, double saldo, double tasaInteresMensual, double saldoMinimo) {
        super(numeroCuenta, titular, saldo);
        this.tasaInteresMensual = tasaInteresMensual;
        this.saldoMinimo = saldoMinimo;
    }

    // Sobreescribo describir()
    @Override
    public String describir() {
        return super.describir() + " | Tasa mensual: " + tasaInteresMensual + "%";
    }

    // Sobreescribo calcularComision()
    @Override
    public double calcularComision() {
        if (getSaldo() >= saldoMinimo) {
            return 0.0;
        } else {
            return 12000.0;
        }
    }

    // Sobrecarga de realizarRetiro ( que recibe: esUrgente)
    public void realizarRetiro(double monto, boolean esUrgente) {
        if (esUrgente) {
            double saldoResultante = getSaldo() - monto;
            double comision = 0.0;
            if (saldoResultante < saldoMinimo) {
                comision = 12000.0;
            }
            setSaldo(getSaldo() - monto - comision);
        } else {
            realizarRetiro(monto);
        }
    }

    // propio de CuentaAhorros
    public double calcularInteresDelMes() {
        return getSaldo() * tasaInteresMensual / 100.0;
    }
}