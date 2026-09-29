import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String nombre;
    private List<Curso> cursos = new ArrayList<>();

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void inscribirse(Curso curso) {
        if (!cursos.contains(curso)) {
            cursos.add(curso);
            curso.agregarEstudiante(this);
        }
    }

    public void mostrarCursos() {
        System.out.println("Cursos de " + nombre + ":");
        for (Curso c : cursos) {
            System.out.println(" - " + c.getNombre());
        }
    }
}
