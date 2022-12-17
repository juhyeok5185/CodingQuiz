public class star12 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            if (i < 6) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
                continue;
            } else {
                for (int j = i; j < 10; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
