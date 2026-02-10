import javax.swing.*;
import java.awt.*;

public class BotonMorado {
    public static void main(String[] args) {

        JFrame ventana = new JFrame("Botón Morado");
        ventana.setSize(300, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(new FlowLayout());

        JButton boton = new JButton("Haz clic aquí");
        boton.setBackground(new Color(128, 0, 128)); // Color morado
        boton.setForeground(Color.WHITE); // Texto blanco
        boton.setFocusPainted(false);

        ventana.add(boton);
        ventana.setVisible(true);
    }
}
