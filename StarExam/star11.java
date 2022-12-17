public class star11 {
    public static void main(String[] args) {
        for (int i = 0; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                if (5 - j <= 0 + i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
