import java.util.Arrays;
import java.util.Scanner;

public class SortAnArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = {12, 32, 1, 4, 65, 45, 76, 43, 23};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}