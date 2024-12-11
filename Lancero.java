public class Lancero extends Soldado {
    public Lancero(String nombre) {
        super(nombre, getRandomNivelVida(4, 6), 9, 4);
    }

    @Override
    public void atacar() {
    }

    @Override
    public void defender() {
    }

    @Override
    public String getSimbolo() {
        return "L";
    }
}
