import java.util.*;

public class PostiveNegativeZero {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Number Chekar\n");
        System.out.println("Please enter your number:- ");
        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println("your number is positive ");
        } else if (num == 0) {
            System.out.println("yor number is zero");
        } else {
            System.out.println("your number is negative");
        }
    }
}
