package sebelasrpl2;
/**
 *
 * @author User
 */
import java.util.Scanner;
public class Perbandingan2
{
   public static void main(String[] args)
   {
     Scanner input = new Scanner(System.in);
     
     int angka1;//angka pertama yang dibandingkan
     int angka2;//angka kedua yang dibandingkan
     
     System.out.print("Masukan angka pertama : ");
     angka1=input.nextInt();//membaca angka pertama
     
     System.out.print("Masukan angka kedua : ");
     angka2=input.nextInt();//membaca angka pertama
     
     if(angka1 == angka2)//kondisi pertama
         System.out.printf("Angka %d = angka %d\n",angka1,angka2);
     
     if(angka1 >= angka2)//kondisi kedua
         System.out.printf("Angka %d >= angka %d",angka1,angka2);
     
     if(angka1 <= angka2)//kondisi ketiga
         System.out.printf("Angka %d <= angka %d\n",angka1,angka2);
     
     if(angka1 != angka2)//kondisi keempat
         System.out.printf("Angka %d != angka %d\n",angka1,angka2);
     
     if(angka1 < angka2)//kondisi kelima
         System.out.printf("Angka %d < angka %d\n",angka1,angka2);
     
     if(angka1 > angka2)//kondisi keenam
         System.out.printf("Angka %d > angka %d\n",angka1,angka2);
   }
}
