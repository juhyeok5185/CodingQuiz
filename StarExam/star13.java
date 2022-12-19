public class star13 {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            if (i < 5) {
                for (int j = i; j < 5; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for (int j = 3; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
