public class PagoEfectivo implements MetodoPago {
    @Override
    public void pagar(double monto) {
        System.out.println("Pago de $" + monto + " en efectivo");
    }
}
