import java.util.HashMap;

public class MaxOccurringCharacter {
    public static void main(String[] args) {
        String string = "asdfghjkkk";
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char c : string.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        char maxChar = string.charAt(0);
        int maxCount = 0;
        for (char c : charCount.keySet()) {
            if (charCount.get(c) > maxCount) {
                maxCount = charCount.get(c);
                maxChar = c;
            }
        }
        System.out.println(maxChar);
    }
}
