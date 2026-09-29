public class Impresora {
    public void imprimir(Documento documento) {
        System.out.println("Imprimiendo: " + documento.getTitulo());
        System.out.println(documento.getContenido());
    }
}
