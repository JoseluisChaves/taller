public interface Volador {
    void volar();

    default void aterrizar() {
        System.out.println("Aterrizando");
    }
}
