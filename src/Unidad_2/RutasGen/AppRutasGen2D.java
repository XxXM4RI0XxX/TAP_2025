package Unidad_2.RutasGen;
// Fig. 2.23: AppRutasGen2D.java
// Demostración de una ruta general.
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.security.SecureRandom;
import javax.swing.JPanel;

public class AppRutasGen2D extends JPanel{
    // dibuja rutas generales
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        SecureRandom aleatorio = new SecureRandom();

        int[] puntosX = {55, 67, 109, 73, 83, 55, 27, 37, 1, 43};
        int[] puntosY = {0, 36, 36, 54, 96, 72, 96, 54, 36, 36};

        Graphics2D g2d = (Graphics2D) g;
        GeneralPath estrella = new GeneralPath();

        // establece la coordenada inicial de la ruta general
        estrella.moveTo(puntosX[0], puntosY[0]);

        // crea la estrella; esto no la dibuja
        for (int cuenta = 1; cuenta < puntosX.length; cuenta++){
            estrella.lineTo(puntosX[cuenta], puntosY[cuenta]);
        }

        estrella.closePath(); // cierra la figura

        g2d.translate(200, 200); // traslada el origen a (200, 200)

        // gira alrededor del origen y dibuja estrellas en colores aleatorios
        for (int cuenta = 1; cuenta <= 20; cuenta++){
            g2d.rotate(Math.PI / 10.0); // gira el sistema de coordenadas
            // establece el color de dibujo al azar
            g2d.setColor(new Color(aleatorio.nextInt(256),
                    aleatorio.nextInt(256), aleatorio.nextInt(256)));

            g2d.fill(estrella); // dibuja estrella rellena
        }
    }
} // fin de la clase AppRutasGen2D