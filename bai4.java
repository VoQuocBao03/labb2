package lab2;
import java.util.Scanner;

public class bai4 
{
    public static void menu()
    {
        System.out.println("+-------------------------------+");
        System.out.println("1. Giai phuong trinh bac 1");
        System.out.println("2. Giai phuong trinh bac 2");
        System.out.println("3. Tinh tien dien");
        System.out.println("4. Ket thuc");
        System.out.println("+-------------------------------+");
        System.out.println("Chon chuc nang: ");
        Scanner sc = new Scanner(System.in);
        int chon = sc.nextInt();
        switch (chon)
        {
            case 1: 
                bai1.main(null);
                break;
            
            case 2: 
                bai2.main(null);
                break;
            case 3:
                bai3.main(null);
            
            case 4: 
                default:
                System.out.println("Ban da nhap sai cu phap");
                break;
        }
    }  
    public static void main(String[] args) 
    {
          menu();

    }
  
}





