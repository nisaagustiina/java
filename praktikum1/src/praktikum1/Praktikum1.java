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
public class Praktikum1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Karyawan karyawan1 = new Karyawan();
//        
//        System.out.println(karyawan1.ID);
//        System.out.println(karyawan1.nama);
//        System.out.println(karyawan1.divisi);
//        System.out.println(karyawan1.gaji);

        //berparameter
        Karyawan karyawan1 = new Karyawan("2208", "Nisa", "IT", 10000000);
        
        System.out.println("ID: "+ karyawan1.ID);
        System.out.println("Nama "+ karyawan1.nama);
        System.out.println("Divisi: "+ karyawan1.divisi);
        System.out.println("Gaji: "+ karyawan1.gaji);
    }
    
}
