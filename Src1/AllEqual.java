import java.util.Scanner;
public class AllEqual {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if (num1 == num2 && num2 == num3) {
            System.out.println("equal");
        }else{
            System.out.println("not equal" );
        }
    }
}

