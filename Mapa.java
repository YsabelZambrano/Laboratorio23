public class Mapa {
    private char[][] mapa;

    public Mapa() {
        this.mapa = new char[10][10];  // Ejemplo de mapa 10x10
    }

    public void mostrarMapa() {
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                System.out.print(mapa[i][j] + " ");
            }
            System.out.println();
        }
    }
}
