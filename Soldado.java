public abstract class Soldado {
    private String nombre;
    private int nivelVida;
    private int ataque;
    private int defensa;

    public Soldado(String nombre, int nivelVida, int ataque, int defensa) {
        this.nombre = nombre;
        this.nivelVida = nivelVida;
        this.ataque = ataque;
        this.defensa = defensa;
    }

    public abstract void atacar();
    public abstract void defender();
    public abstract String getSimbolo();

    public String getNombre() {
        return nombre;
    }

    protected int getRandomNivelVida(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    protected int getRandomValue(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}
