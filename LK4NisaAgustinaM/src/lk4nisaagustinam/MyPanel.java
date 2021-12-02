package lk4nisaagustinam;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Polygon;

public class MyPanel extends JPanel{
    public void paintComponent(Graphics j){
        super.paintComponent(j);
        j.drawString("Nisa Agustina (XII-RPL2)",40,20);

        j.setColor(Color.YELLOW);
        j.fillRect(125, 150, 102, 50);
//        j.fillRect(100, 120, 225, 99);
        j.setColor(Color.RED);
        j.fillPolygon(new int[] {150,175,200}, new int[] {200,150,200}, 3);
        j.setColor(Color.BLUE);
        j.fillRect(150,200,51,50);
//        j.fillRect(149,220,125,100);
        j.setColor(Color.BLUE);
        j.drawRect(125, 200, 25, 49);
//        j.drawRect(100,220,50,99);
        j.setColor(Color.BLUE);
        j.drawRect(200, 200, 25, 49);
//        j.drawRect(274,220,50,99);
        
        
        
        
    }
}
