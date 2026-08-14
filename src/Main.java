import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Variables declaradas con el tipo de la clase padre (CuentaBancaria)
        CuentaBancaria c1 = new CuentaAhorros("AH-001", "Ana Gómez", 1000000.0, 0.5, 500000.0);
        CuentaBancaria c2 = new CuentaCorriente("CC-002", "Distribuidora XYZ", 800000.0, 5000.0, 300000.0);
        CuentaBancaria c3 = new CuentaInversion("IN-003", "Carlos Ruiz", 2000000.0, 8.0, 12, 50000.0);

        //  describir() polimórfismo
        System.out.println(c1.describir());
        System.out.println(c2.describir());
        System.out.println(c3.describir());

        System.out.println("----");

        //  calcularComision() polimórfismo
        System.out.println("Comisión c1: $" + c1.calcularComision() + "  (saldo 1000000 >= mínimo 500000)");
        System.out.println("Comisión c2: $" + c2.calcularComision() + "  (comisión por transacción)");
        System.out.println("Comisión c3: $" + c3.calcularComision() + "  (penalización)");

        System.out.println("----");

        //  realizarRetiro(500000.0) polimórfico
        c1.realizarRetiro(500000.0);
        c2.realizarRetiro(500000.0);
        c3.realizarRetiro(500000.0);

        System.out.println("Saldo c1: $" + c1.getSaldo() + "  (1000000 - 500000, retiro normal)");
        System.out.println("Saldo c2: $" + c2.getSaldo() + "  (800000 - 500000 - 5000 comisión)");
        System.out.println("Saldo c3: $" + c3.getSaldo() + "  (2000000 - 500000 - 50000 penalización)");


    }
}