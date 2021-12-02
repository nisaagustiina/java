/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkapsulasi;

/**
 *
 * @author icha
 */
public class Manusia {
    //field
    private String nama;
    public String tinggal;
    
    //public protected = success
    
    //method
    public void tampilInfo(){
        System.out.println("Nama : "+nama+"\nTinggal di : "+tinggal);
    }
}
