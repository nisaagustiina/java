package konfigurasi;
import java.sql.*;

public class Koneksi {
    Connection koneksi;
    
    public static Connection konfigurasi(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/pos","root","");
            return koneksi;
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
