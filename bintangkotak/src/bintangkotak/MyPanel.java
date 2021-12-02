package bintangkotak;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class MyPanel extends JPanel{
    public void paintComponent(Graphics j){
        super.paintComponent(j);
        
        //mengatur tulisan
        j.drawString("Bentuk Bangunan",40,20); //40 horizontal, 20 vertikal
        //membuat kotak
        j.setColor(new Color(0,100,200));
        j.drawLine(50,50,150,50);//strip di atas
        j.setColor(new Color(255,0,0));
        j.drawLine(50,50,50,100);//strip kebawah dikiri
         j.setColor(new Color(0,255,0));
        j.drawLine(50,100,150,100);//strip dibawah
         j.setColor(new Color(0,0,0));
        j.drawLine(150,50,150,100);//strip ke bawah di kanan
        
        j.setColor(Color.YELLOW);
        j.drawRect(200,50,100,50);//(int x, int y, int width, int height)
        j.fillRect(200, 120, 100, 20);
    }
}
