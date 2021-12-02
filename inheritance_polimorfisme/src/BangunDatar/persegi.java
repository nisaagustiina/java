//Nama : Nisa Agustina M
//Kelas : XII RPL2
//Tgl : 8 Agustus 2020

package BangunDatar;

public class persegi extends bangundatar{
    int sisi;
    
    public persegi(int sisi){
        this.sisi =  sisi;
    }
    
    public float luas(){
        return this.sisi * this.sisi;
    }
    
    public float keliling(){
        return this.sisi * 4;
    }
}
