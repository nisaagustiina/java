package sebelasrpl2;

/**
 *
 * @author icha
 */
public class BilGenap
{
    public static void main(String[] args)
    {
        int [] bil = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        System.out.print("Bilangan Genap : \n");
        for(int b =0;b<bil.length;b++)
        {
            if (bil[b] % 2 == 0)
            {
                System.out.print(bil[b]+ "\n");
            }
        }
    }
}
