package appcrud;
import java.sql.*;

public class APPCRUD {
    
    public static void main(String[] args) {
        // TODO code application logic here
//        try{
//            Class.forName("com.mysql.jdbc.Driver").newInstance();
//            System.out.println("Proses Deteksi Driver Berhasil");
//        }catch (final InstantiationException | IllegalAccessException | ClassNotFoundException ex){
//        }
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String username = "root";
            String password = "";
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+"db_siswa",username,password);
            Statement stmt = koneksi.createStatement();
            System.out.println("Statement Berhasil");
        }catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
        }
//    try{
//    Class.forName("com.mysql.jdbc.Driver");
//    }catch (Java.lang.ClassNotFoundException e){
//    System.err.print("ClassNotFoundException: ");
//    System.err.println(e.getMessage());
 // }
//    try{
//            Class.forName("com.mysql.jdbc.Driver").newInstance();
//            String username = "root";
//            String password = "";
//            Connection koneksi = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/"+"db_siswa",username,password);
////            Statement stmt = koneksi.createStatement();
////            System.out.println("Statement Berhasil"); //DELETE
////            stmt.executeUpdate("INSERT INTO identitas" + "(ID, NAMA, TANGGAL_LAHIR, ALAMAT, KONTAK)" + "VALUES" + "('00', 'Nisa Agustina', '2002-08-22', 'Bandung', 'nisaagustiina@gmail.com');"); Insert
////               stmt.executeUpdate("UPDATE IDENTITAS" + "SET" + "ALAMAT = 'Jakarta', " + "KONTAK = 'caca@gmail.com' " + "WHERE ID = '00';"); UPDATE
//        }catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
//        }
    }  
}
