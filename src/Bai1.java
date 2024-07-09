import java.util.Scanner;

public class Bai1 {
    // Kiểm tra số nguyên tố
    public static void main(String[] args) {
        // Bước 1: Khai báo biến số nguyên numbers và nhập giá trị từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng số nguyên tố cần in ra: ");
        int numbers = scanner.nextInt();

        // Bước 2: Khai báo biến count và gán giá trị 0
        int count = 0;

        // Bước 3: Khai báo biến N và gán giá trị 2
        int N = 2;

        // Bước 4: Trong khi count < numbers
        while (count < numbers) {
            // Kiểm tra xem N có phải là số nguyên tố không
            if (isPrime(N)) {
                // Nếu N là số nguyên tố, in ra giá trị của N và tăng giá trị của count lên 1
                System.out.println(N);
                count++;
            }
            // Giá trị của N tăng lên 1 để kiểm tra số tiếp theo
            N++;
        }
    }

    // Hàm kiểm tra số nguyên tố
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
