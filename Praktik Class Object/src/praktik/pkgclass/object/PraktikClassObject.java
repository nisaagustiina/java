/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktik.pkgclass.object;

/**
 *
 * @author icha
 */
public class PraktikClassObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Membuat objek pelajar dan karyawan
        Orang pelajar = new Orang();
        Orang karyawan = new Orang();
        
        //Mengisi Atribut Pelajar
        pelajar.namaAwal = "Cecep";
        pelajar.namaAkhir = "Muhammad";
        pelajar.umur = 16;
        
        //Menjalankan method pelajar
        pelajar.Belajar();
        
        karyawan.namaAwal = "Asep";
        karyawan.namaAkhir = "Abdullah";
        karyawan.umur = 20;
        
        karyawan.Bersepeda();
    }
    
}
