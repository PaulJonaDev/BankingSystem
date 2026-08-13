import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Creamos una cuenta de ahorros
        // Parámetros: numeroCuenta, titular y de mas....
        CuentaAhorros cuenta1 = new CuentaAhorros("AH-001", "Ana Gómez", 1000000.0, 0.5, 500000.0);

        // 1. Probamos el método describir()
        System.out.println("--- Descripción de la cuenta ---");
        System.out.println(cuenta1.describir());

        // 2. Probamos la comisión actual
        System.out.println("\n--- Comisión actual ---");
        System.out.println("Comisión: $" + cuenta1.calcularComision());

        // 3. Probamos un retiro normal
        System.out.println("\n--- Retiro normal de $200,000 ---");
        cuenta1.realizarRetiro(200000.0);
        System.out.println("Nuevo saldo: $" + cuenta1.getSaldo());

        // 4. Probamos el cálculo de interés del mes
        System.out.println("\n--- Interés del mes ---");
        System.out.println("Interés generado: $" + cuenta1.calcularInteresDelMes());
    }
}