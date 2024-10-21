import java.util.Scanner;
public class FractionCalculator {
    public static double calculateFraction(int a, int b) throws ArithmeticException {
        if (a == 0) {
            throw new ArithmeticException("Mẫu số không thể bằng 0.");
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            double result = calculateFraction(a, b);
            System.out.println("Giá trị thập phân của phân số là: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}
