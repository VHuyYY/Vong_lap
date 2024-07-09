import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên tố");
        int start = sc.nextInt();
        for (int i = start ; i <= 100 ; i++)
        {
            if (isPrime(i))
            {
                System.out.println(i);
            }
        }
        sc.close();
    }
    // Kiểm tra số nguyên tố
    public static boolean isPrime (int num)
    {
        if (num <= 1 ) // Số Nguyên Tố Lớn Hơn 1
            for ( int i = 2; i <= Math.sqrt(num); i++ )
            {
                if (num % i == 0)
                    return false;
            }
        return true;
    }
}
