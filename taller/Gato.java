public class Gato extends Animal {
    private boolean esDomestico;

    public Gato(String nombre, int edad, boolean esDomestico) {
        super(nombre, edad);
        this.esDomestico = esDomestico;
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: Miau");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Domestico: " + (esDomestico ? "Si" : "No"));
    }
}
