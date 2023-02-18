package lab2;
import java.util.Scanner;
public class bai1
{
    public static void main(String[] args)
    {
        float a, b;
        Scanner sc = new Scanner(System.in);
            System.out.println("nhap a: "); a = sc.nextFloat();
            System.out.println("Nhap b: "); b = sc.nextFloat();
        if(a == 0)
        {
            if(b == 0)
            {
                System.out.println("Phuong trinh vo so nghiem");
            }
            else
            {
                System.out.println("Phuong trinh vo nghiem");
            }   
        }
        else
        {
            float x = -b/a;
            System.out.println("Phuong trinh co 1 nghiem la: " + x );
        }
    }
}