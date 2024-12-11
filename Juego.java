import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Juego extends JFrame {
    private Ejercito ejercito1;
    private Ejercito ejercito2;
    private JTextArea outputArea;

    public Juego() {
        this.ejercito1 = new Ejercito("Inglaterra");
        this.ejercito2 = new Ejercito("Francia");

        setTitle("Juego de Estrategia");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel topPanel = new JPanel();
        JButton iniciarButton = new JButton("Iniciar Juego");
        iniciarButton.addActionListener(new IniciarJuegoListener());
        topPanel.add(iniciarButton);

        outputArea = new JTextArea();
        outputArea.setEditable(false);

        add(topPanel, BorderLayout.NORTH);
        add(new JScrollPane(outputArea), BorderLayout.CENTER);
    }

    private class IniciarJuegoListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
 
            ejercito1.agregarSoldado(new Arquero("Arquero1"));
            ejercito1.agregarSoldado(new Caballero("Caballero1"));
            ejercito2.agregarSoldado(new Espadachin("Espadachin1"));
            ejercito2.agregarSoldado(new Lancero("Lancero1"));

            outputArea.append("Ejercito 1: Inglaterra\n");
            ejercito1.mostrarEjercito(outputArea);
            outputArea.append("\nEjercito 2: Francia\n");
            ejercito2.mostrarEjercito(outputArea);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Juego juego = new Juego();
            juego.setVisible(true);
        });
    }
}
