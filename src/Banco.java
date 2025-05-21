public class Banco {
    //Atributos - Privados
     private String titular;
     private  double saldo;

     //Constructor (Método)
    public Banco (String titular, double saldoInicial){
this.titular = titular;
this.saldo = saldoInicial;
    }
    //Métodos que son comunes en los bancos
    //Método para obtener dinero
    public String getTitular (){
        return this.titular;
    }

    //Método para obtener el saldo
    public double getSaldo(){
        return this.saldo;
    }
    //Método para depositar dinero
    public void  depositar (double cantidad) {
        //Es nuestros  métodos es justo y necesario que hagamos validaciones
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.printf("Deposito realizado con éxito. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("Cantidad no valida para depositar");
        }
    }
    //Método para retirar dinero
    public void retirar(double cantidad){
        if (cantidad > 0 && cantidad <= saldo){
            saldo -= cantidad;
            System.out.println("Retiro exitoso, Saldo restante $"+ saldo);
        }else {
    }
    }
}
