public class Pato extends Animal implements Volador, Nadador {
    public Pato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void volar() {
        System.out.println(nombre + " esta volando");
    }

    @Override
    public void nadar() {
        System.out.println(nombre + " esta nadando");
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: Cuac");
    }
}
