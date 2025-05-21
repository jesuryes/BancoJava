public class Main {
    public static void main(String[] args) {
        // Crear una cuenta nueva
        Banco cuenta1 = new Banco("Kevin", 1000);

        // Mostrar el saldo inicial
        System.out.println("Titular: " + cuenta1.getTitular());
        System.out.println("Saldo inicial: $" + cuenta1.getSaldo());

        // Realizar un depósito
        cuenta1.depositar(500);

        // Realizar un retiro
        cuenta1.retirar(300);

        // Intentar retirar más de lo disponible
        cuenta1.retirar(2000);
    }
}