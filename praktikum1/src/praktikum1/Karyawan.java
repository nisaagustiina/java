/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum1;

/**
 *
 * @author icha
 */
public class Karyawan {
    String ID,nama,divisi;
    double gaji;
    
    //constructor
    //default
//    Karyawan(){
//        System.out.println("constructor dipanggil");
//    }
    
    //berparameter
    Karyawan(String ID, String nama, String divisi, double gaji){
        this.ID = ID;
        this.nama = nama;
        this.divisi = divisi;
        this.gaji = gaji; 
    }
    
    void cetakData(){
        System.out.println("Data Karyawan : ");
        System.out.println("ID: "+ ID);
        System.out.println("Nama "+ nama);
        System.out.println("Divisi: "+ divisi);
        System.out.println("Gaji: "+ gaji);
    }
}
