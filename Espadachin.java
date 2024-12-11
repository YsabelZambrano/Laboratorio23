public class Espadachin extends Soldado {
    public Espadachin(String nombre) {
        super(nombre, getRandomNivelVida(4, 6), 8, 4);
    }

    @Override
    public void atacar() {
    }

    @Override
    public void defender() {
    }

    @Override
    public String getSimbolo() {
        return "E";
    }
}
