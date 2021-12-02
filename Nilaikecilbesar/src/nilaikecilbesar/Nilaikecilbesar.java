package nilaikecilbesar;
import java.util.Scanner;
/**
 *
 * @author icha
 */
public class Nilaikecilbesar
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan nilai : ");
        int a = scan.nextInt();
        int angka[] = new int [a];
        int min,max;
        for(int b = 0;b < a; b++)
        {
            System.out.print("Masukan angka ke "+b+" : ");
            angka[b]= scan.nextInt();
        }
        min=angka[0];
        max=angka[0];
        System.out.print("Angka-angaka yang diinput adalah : ");
        for(int b=0;b<a;b++)
        {
            System.out.print(angka[b] + " ,");
            if (angka [b]<min)
                min = angka[b];
            if (angka[b]>max)
                max =  angka[b];
        }
        System.out.println("\n Nilai terkecil adalah : "+min+"\n Nilai trbesar adalah : "+max);
    }
    
}
