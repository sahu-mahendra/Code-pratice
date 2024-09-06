import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesArray {
    public static void main(String[] args) {
        int[] arr = {1, 22, 3, 22, 4, 5, 55, 4, 6, 6, 2, 6,};
        Arrays.sort(arr);
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(set);

    }
}
