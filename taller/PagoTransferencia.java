public class PagoTransferencia implements MetodoPago {
    private String banco;

    public PagoTransferencia(String banco) {
        this.banco = banco;
    }

    @Override
    public void pagar(double monto) {
        System.out.println("Pago de $" + monto + " por transferencia desde " + banco);
    }
}
