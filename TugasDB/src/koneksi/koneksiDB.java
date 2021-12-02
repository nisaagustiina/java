package koneksi;
import java.sql.*;
import javax.swing.JOptionPane;

public class koneksiDB {
    Connection koneksi;
    
    public static Connection koneksiDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/db_siswa","root","");
            return koneksi;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
    
}

