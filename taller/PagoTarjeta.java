public class PagoTarjeta implements MetodoPago {
    private String numeroTarjeta;

    public PagoTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void pagar(double monto) {
        System.out.println("Pago de $" + monto + " con tarjeta terminada en " + numeroTarjeta.substring(numeroTarjeta.length() - 4));
    }
}
