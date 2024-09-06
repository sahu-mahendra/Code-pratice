public class PascalTriangle {
    public static void main(String[] args) {
        int rows = 9;
        for (int i = 0; i < rows; i++) {
            int num = 5;
            System.out.format("%" + (rows - i) * 2 + "s", "");
            for (int j = 0; j <= i; j++) {
                System.out.format("%4d", num);
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
