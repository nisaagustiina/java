/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek.pkgthis;

/**
 *
 * @author icha
 */
public class Kendaraan {
    String nomor;
    String nama;
    
    public Kendaraan (String nomor, String nama){
        this.nomor = nomor;
        this.nama = nama;
    }

    Kendaraan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void infoKendaraan(){
        System.out.println("nomor plat = "+nomor+", nama kendaraan = "+nama);
    }
}
