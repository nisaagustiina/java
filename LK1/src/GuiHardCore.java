import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
        
       
public class GuiHardCore extends JFrame{
    //membuat objek ctn dari class container
    private Container ctn = new Container();
    
    public GuiHardCore(String title){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //membuat form dengan ukuran 300 x 150
        setSize(300,150);
        //menentukan lokasi form
        setLocation(200,150);
        setTitle(title);
        ctn = getContentPane();
        //menyisipkan letak tombol 
        ctn.add(new JButton("Tombol 1"),BorderLayout.PAGE_START);
        ctn.add(new JButton("Tombol 2"),BorderLayout.CENTER);
        ctn.add(new JButton("Tombol 3"),BorderLayout.LINE_START);
        ctn.add(new JButton("Tombol 4"),BorderLayout.PAGE_END);
        ctn.add(new JButton("Tombol 5"),BorderLayout.LINE_END);
    }
    
    //program utama
    public static void main (String args[]){
        JFrame.setDefaultLookAndFeelDecorated(true);
        new GuiHardCore("Jendela Utama");
    }
    
}
