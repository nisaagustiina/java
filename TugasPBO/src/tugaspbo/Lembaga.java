package tugaspbo;

public class Lembaga {
    String nama;
    String alamat;
    String notlp;
    String status;
    
    void pendidikan(){
        System.out.println("Nama = " +nama+ "\n"+"Alamat = "+alamat+"\n"+"No. Tlp = "+notlp+"\n"+"Instansi = Pendidikan \n");
    }
    
     void kesehatan(){
        System.out.println("Nama = " +nama+ "\n"+"Alamat = "+alamat+"\n"+"No. Tlp = "+notlp+"\n"+"Instansi = Kesehatan \n");
    }
    
    public Lembaga(String status){
        this.status = status;
    }
    
    public void infoLembaga(){
        System.out.println("Nama = "+nama+", Status Akreditasi = "+status);
    }
}
