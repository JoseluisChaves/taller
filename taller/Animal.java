public class Animal {
    protected String nombre;
    protected int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void hacerSonido() {
        System.out.println(nombre + " hace un sonido");
    }

    public void mostrarInfo() {
        System.out.println("Animal: " + nombre + ", edad: " + edad);
    }
}
