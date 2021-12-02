package tugaspbo1;

public class TugasPBO1 {

    public static void main(String[] args) {
        Kendaraan kendaraan1 = new Kendaraan();
        Kendaraan kendaraan2 = new Kendaraan();
        
        kendaraan1.nama = "Kawasaki Ninja";
        kendaraan1.nomor = "D1234CW";
        
        kendaraan2.nama = "Honda CBR";
        kendaraan2.nomor = "B1234CW";
        
        kendaraan1.infoKendaraan();
        kendaraan2.infoKendaraan();
    }
    
}
