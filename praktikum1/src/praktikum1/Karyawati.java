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
public class Karyawati extends Karyawan{
    public Karyawati(String ID, String nama, String divisi, double gaji){
        super (ID, nama, divisi, gaji);
    }
    
    void cetakKaryawati(){
        super.cetakData();
    }
}
