import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.println("Welcome to odd even Calculator 124214\n");
        System.out.println("Please enter the your number :-");

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("your number is an even");
        } else {
            System.out.println("your number is an odd");

        }
    }

}

