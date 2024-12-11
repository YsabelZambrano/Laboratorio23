import java.util.ArrayList;
import java.util.List;

public class Ejercito {
    private List<Soldado> soldados;
    private String nombre;

    public Ejercito(String nombre) {
        this.nombre = nombre;
        this.soldados = new ArrayList<>();
    }

    public void agregarSoldado(Soldado soldado) {
        soldados.add(soldado);
    }

    public void mostrarEjercito(JTextArea area) {
        for (Soldado soldado : soldados) {
            area.append(soldado.getNombre() + " (" + soldado.getSimbolo() + ")\n");
        }
    }
}
