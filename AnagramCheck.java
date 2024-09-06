import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String string1 = "Lamp";
        String string2 = "Silent";
        char[] arr1 = string1.toCharArray();
        char[] arr2 = string2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1, arr2));

    }
}
