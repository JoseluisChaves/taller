public class Main {
    public static void main(String[] args) {
        System.out.println("=== HERENCIA ===");
        Animal[] animales = {
            new Perro("Rex", 3, "Labrador"),
            new Gato("Michi", 2, true)
        };
        for (Animal a : animales) {
            a.mostrarInfo();
            a.hacerSonido();
        }

        System.out.println("\n=== CLASE ABSTRACTA ===");
        Figura[] figuras = {
            new Circulo("Rojo", 5),
            new Rectangulo("Azul", 4, 6)
        };
        for (Figura f : figuras) {
            f.mostrarColor();
            System.out.printf("Area: %.2f%n", f.calcularArea());
        }

        System.out.println("\n=== INTERFAZ MULTIPLE ===");
        Pato pato = new Pato("Donald", 4);
        pato.hacerSonido();
        pato.volar();
        pato.nadar();
        pato.aterrizar();

        System.out.println("\n=== DEPENDENCIA ===");
        Documento doc = new Documento("Informe", "Contenido del informe");
        Impresora impresora = new Impresora();
        impresora.imprimir(doc);

        System.out.println("\n=== ASOCIACION MUCHOS A MUCHOS ===");
        Estudiante e1 = new Estudiante("Ana");
        Estudiante e2 = new Estudiante("Luis");
        Curso c1 = new Curso("Programacion");
        Curso c2 = new Curso("Bases de Datos");
        e1.inscribirse(c1);
        e1.inscribirse(c2);
        e2.inscribirse(c1);
        e1.mostrarCursos();
        e2.mostrarCursos();
        c1.mostrarEstudiantes();
        c2.mostrarEstudiantes();

        System.out.println("\n=== INTERFACE ===");
        MetodoPago[] pagos = {
            new PagoTarjeta("1234567812345678"),
            new PagoEfectivo(),
            new PagoTransferencia("Bancolombia")
        };
        for (MetodoPago p : pagos) {
            p.pagar(150000);
        }
    }
}
