package enkapsulasi;

public class Enkapsulasi {
  public static void main(String[] args) {
        //Membuat objek buruh dari kelas manusia
        Manusia buruh = new Manusia();
        
        //Memanggil field dari kelas manusia
        buruh.nama = "Roy";
        buruh.tinggal = "Bandung";
        
        //Memanggil method dari kelas manusia
        buruh.tampilInfo();
    }
    
}
