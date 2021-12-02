//Nama : Nisa Agustina M
//Kelas : XII RPL2
//Tgl : 8 Agustus 2020

package BangunDatar;

public class main {
    public static void main(String[] args){
        
        bangundatar bangunDatar = new bangundatar();
        persegi Persegi = new persegi(8);
        persegipanjang persegiPanjang = new persegipanjang(3, 6);
        segitiga Segitiga = new segitiga(5,8);
        jajargenjang jajarGenjang = new jajargenjang(2, 7);
        lingkaran Lingkaran = new lingkaran(7);
        
        bangunDatar.luas();
        bangunDatar.keliling();
        
        System.out.println("Luas Persegi : " + Persegi.luas());
        System.out.println("Keliling Persegi : " + Persegi.keliling());
        System.out.println("Luas Persegi Panjang: " + persegiPanjang.luas());
        System.out.println("Keliling Persegi Panjang: " + persegiPanjang.keliling());
        System.out.println("Luas Segitiga : " + Segitiga.luas());
        System.out.println("Luas Jajargenjang : " + jajarGenjang.luas());
        System.out.println("Luas Lingkaran : " + Lingkaran.luas());
        System.out.println("Keliling Lingkaran : " + Lingkaran.keliling());
    }
}
