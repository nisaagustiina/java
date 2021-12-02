//Nama Program = Instansi Pemerintahan
//Pembuat = Nisa Agustina (XI RPL 2)
//Tgl = 24 Maret 2020
//Deskripsi = Program ini bertujuan untuk mengetahui profile dari suatu instansi pemerintahan
package tugaspbo;

public class TugasPBO {

    public static void main(String[] args) {
        Lembaga sekolah = new Lembaga("A");
        Lembaga rs = new Lembaga("Paripurna");
        
        sekolah.nama = "SMKN 1 Katapang";
        sekolah.alamat = "Jl. Ceuri Ters. Kopo Km.13,5 Kec. Katapang, Kab.Bandung";
        sekolah.notlp = "022 5893737";
        
        sekolah.pendidikan();
        
        rs.nama = "RS Hasan Sadikin";
        rs.alamat = "Jl. Pasteur No.38, Pasteur, Kec. Sukajadi, Kota Bandung, Jawa Barat 40161";
        rs.notlp = "022 2551111";
        
        rs.kesehatan();
        
        sekolah.infoLembaga();
        rs.infoLembaga();
    }
    
}
