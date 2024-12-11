public class Caballero extends Soldado {
    public Caballero(String nombre) {
        super(nombre, getRandomNivelVida(5, 7), 10, 5);
    }

    @Override
    public void atacar() {
    }

    @Override
    public void defender() {
    }

    @Override
    public String getSimbolo() {
        return "C";
    }
}
