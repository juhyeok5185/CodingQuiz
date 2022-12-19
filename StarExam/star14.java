public class star14 {
    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
            if (i < 5) {
                for (int j = 0; j <= 4; j++) {
                    if (i > j) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.println();
            } else {
                for (int j = 0; j <= 4; j++) {
                    if (i - 4 < j) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

        }
    }
}
