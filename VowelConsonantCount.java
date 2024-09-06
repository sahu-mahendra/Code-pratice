public class VowelConsonantCount {
    public static void main(String[] args) {
        String string = "Logitech";
        int vowels = 0, consonanats = 0;
        for (char c : string.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) != -1) {
                vowels++;
            } else if (Character.isLetter(c)) {
                consonanats++;
            }
        }
        System.out.println("Vowels:" + vowels + ",Consonants:" + consonanats);
    }
}
