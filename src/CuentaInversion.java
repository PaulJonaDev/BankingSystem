public class CuentaInversion extends CuentaBancaria {
    private double tasaAnual;
    private int plazoMeses;
    private double penalizacionRetiroAnticipado;

    // Constructor
    public CuentaInversion(String numeroCuenta, String titular, double saldo, double tasaAnual, int plazoMeses, double penalizacionRetiroAnticipado) {
        super(numeroCuenta, titular, saldo);
        this.tasaAnual = tasaAnual;
        this.plazoMeses = plazoMeses;
        this.penalizacionRetiroAnticipado = penalizacionRetiroAnticipado;
    }

    //  describir()
    @Override
    public String describir() {
        return super.describir() + " | Plazo: " + plazoMeses + " meses | Tasa anual: " + tasaAnual + "%";
    }

    //  método del padre (sin parámetros)
    @Override
    public double calcularComision() {
        return penalizacionRetiroAnticipado;
    }

    // Sobrecarga del método (mismo nombre, diferente firma/parámetros)
    public double calcularComision(int mesesTranscurridos) {
        if (mesesTranscurridos >= plazoMeses) {
            return 0.0;
        } else {
            return penalizacionRetiroAnticipado;
        }
    }

    //  realizarRetiro()
    @Override
    public void realizarRetiro(double monto) {
        setSaldo(getSaldo() - monto - penalizacionRetiroAnticipado);
    }
}

