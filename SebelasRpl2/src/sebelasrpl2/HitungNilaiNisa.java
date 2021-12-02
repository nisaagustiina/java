package sebelasrpl2;
/**
 *
 * @author User
 */
import java.util.Scanner;
public class HitungNilaiNisa
{
    public static void main(String[] args)
    {
      Scanner input = new Scanner(System.in);  
      
      String nama,kelas;
      int nilai1,nilai2,nilai3,hasil,hasill;
      
      System.out.print("Nama : ");
      nama = input.nextLine();
      System.out.print("Kelas : ");
      kelas = input.nextLine();
      System.out.print("Nilai Matematika : ");
      nilai1 = input.nextInt();      
      System.out.print("Nilai B.Indonesia : ");
      nilai2 = input.nextInt();
      System.out.print("Nilai B.Inggris : ");
      nilai3 = input.nextInt();
      
      hasil = nilai1 + nilai2 + nilai3;
      hasill = hasil/3;
      
      System.out.printf("Hasil akhir : %d \n", hasill);
      
      if(hasill<31)
          System.out.printf("Predikat : E \n",hasill);
      else
      if(hasill<51)
          System.out.printf("Predikat : D \n",hasill);
      else
      if(hasill<71)
          System.out.printf("Predikat : C \n",hasill);
      else
      if(hasill<91)
          System.out.printf("Predikat : B \n",hasill);
      else
      if(hasill<101)
          System.out.printf("Predikat : A \n",hasill);
      
     
      if(hasill<51)
          System.out.printf("Status : GAGAL\n",hasill);
      else
      if(hasill<101)
          System.out.printf("Status : LULUS\n",hasill);
      
    }   
}
