//Nama : Nisa Agustina M
//Kelas : XII RPL2
//Tgl : 8 Agustus 2020

package BangunDatar;

public class persegipanjang extends bangundatar{
    int panjang;
    int lebar;
    
    public persegipanjang(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public float luas(){
        return this.panjang * this.lebar;
    }
    
    public float keliling(){
        return (2 * this.panjang * this.lebar);
    }
}
