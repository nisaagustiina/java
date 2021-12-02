package sebelasrpl2;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class SebelasRpl2
{//begin
    public static void main(String[] args) 
    {
    Scanner input = new Scanner(System.in);
    
    int angka1,angka2,hasil; //variabel
    
    System.out.print("Masukan angka pertama : ");
    angka1 = input.nextInt();//membaca input atau ouput dari user
    System.out.print("Masukan angka kedua : ");
    angka2 = input.nextInt();//membaca input atau ouput dari user
    
    hasil = angka1 + angka2;
    
    System.out.printf("hasil = %d", hasil );
    }
}//end
