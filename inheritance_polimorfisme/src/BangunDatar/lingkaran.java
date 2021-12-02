//Nama : Nisa Agustina M
//Kelas : XII RPL2
//Tgl : 8 Agustus 2020

package BangunDatar;

public class lingkaran extends bangundatar{
    int r;
    
    public lingkaran(int r){
        this.r = r;
    }
    
    public float luas(){
        return (float)(Math.PI *  r * r);
    }
    
    public float keliling(){
        return (float) (2 * Math.PI * r);
    }
}
