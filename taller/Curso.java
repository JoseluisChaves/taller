import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombre;
    private List<Estudiante> estudiantes = new ArrayList<>();

    public Curso(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        if (!estudiantes.contains(estudiante)) {
            estudiantes.add(estudiante);
            estudiante.inscribirse(this);
        }
    }

    public void mostrarEstudiantes() {
        System.out.println("Estudiantes de " + nombre + ":");
        for (Estudiante e : estudiantes) {
            System.out.println(" - " + e.getNombre());
        }
    }
}
