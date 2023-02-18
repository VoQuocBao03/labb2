package lab2;
import java.util.Scanner;

public class bai3 
{
  /* Viết chương trình nhập vào số điện sử dụng của tháng và tính tiền điện theo  phương pháp lũy tiến 
✔ Nếu số điện sử dụng từ 0 đến 50 thì giá mỗi số điện là 1000 
✔ Nếu số điện sử dụng trên 50 thì giá mỗi số điện vượt hạn mức là 1200 
HƯỚNG DẪN 
✔ Nếu số điện sử dụng < 50: tien = soDien*1000 
✔ Ngược lại: tien = 50*1000 + (soDien - 50)*1200 
*/ 

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        float sodien;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so dien su dung: "); sodien = sc.nextFloat();
        float tien;
        if(sodien < 50)
        {
            tien = sodien * 1000;
        }
        else
 
        {       
            tien = 50 * 1000 + (sodien - 50) * 1200;
            
        }
        System.out.println(" tien dien thang nay la: " +tien);
    }    
}
