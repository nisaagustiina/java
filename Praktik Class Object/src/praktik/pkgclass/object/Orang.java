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
public class Orang {
    String namaAwal;
    String namaAkhir;
    int umur;
    
    void Belajar(){
        System.out.println(namaAwal+" "+namaAkhir+" Belajar..");
        System.out.println("Umur "+umur);
    }
    
    void Berhitung(){
        System.out.println(namaAwal+" "+namaAkhir+" Berhitung..");
        System.out.println("Umur "+umur);
    }
    
    void Bersepeda(){
        System.out.println(namaAwal+""+namaAkhir+" Bersepeda..");
        System.out.println("Umur "+umur);
    }
}

