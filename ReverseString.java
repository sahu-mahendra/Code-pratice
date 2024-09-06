public class ReverseString {
    public static void main(String[] args) {
        String string = "Logitech is the best gadget";
        StringBuilder reversed = new StringBuilder(string).reverse();
        System.out.println(reversed);
    }
}
