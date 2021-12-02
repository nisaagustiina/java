//Nama : Nisa Agustina M
//Kelas : XII RPL2
//Tgl : 8 Agustus 2020

package BangunDatar;

public class jajargenjang extends bangundatar{
    int alas;
    int tinggi;
    
    public jajargenjang(int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    public float luas(){
        return this.alas * this.tinggi;
    }
    
}
