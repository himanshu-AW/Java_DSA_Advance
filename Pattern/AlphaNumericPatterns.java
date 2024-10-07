public class AlphaNumericPatterns {
    public static void A_to_M(int n) {
        for (int i = 0; i < n; i++) {
            // A
            for (int j = 0; j < n; j++) {
                if (i == 0 && j > 0 && j < (n - 1) || i > 0 && j == 0 || i == (n - 1) / 2 || i > 0 && j == (n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  |  ");
            // B
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 && j < (n - 1) || i == (n - 1) && j < (n - 1) || i == (n - 1) / 2 && j < (n - 1)
                        || i > 0 && i < (n - 1) / 2 && j == (n - 1) || i > (n - 1) / 2 && i < (n - 1) && j == (n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  |  ");
            // C
            for (int j = 0; j < n; j++) {
                if (j == 0 && i > 0 && i < (n - 1) || i == 0 && j > 0 && j < (n - 1)
                        || i == (n - 1) && j > 0 && j < (n - 1) || i == 1 && j == (n - 1)
                        || i == (n - 1 - 1) && j == (n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  |  ");
            // D
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 && j < (n - 1) || i == (n - 1) && j < (n - 1)
                        || i > 0 && i < (n - 1) && j == (n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  |  ");
            // E
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 || i == (n - 1) / 2 && j < (n - 1) || i == (n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  |  ");
            // F
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 || i == (n - 1) / 2 && j < (n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  |  ");
            // G
            for (int j = 0; j < n; j++) {
                if (j == 0 && i > 0 && i < (n - 1) || i == 0 && j > 0 || i == (n - 1) && j > 0
                        || i >= (n - 1) / 2 && j == (n - 1) || j > (n - 1) / 2 && i == (n - 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  |  ");
            // H
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == (n - 1) || i == (n - 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  |  ");
            // I
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == (n - 1) || j == (n - 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  |  ");
            // J
            for (int j = 0; j < n; j++) {
                if (j == (n - 1) && i >= 0 && i < (n - 1) || i == (n - 1) && j < (n - 1) && j > 0
                        || i == (n - 1 - 1) && j == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  |  ");
            // K
            for (int j = 0; j < n; j++) {
                if (j == 0 || i + j == (n - 1) / 2 || i - j == (n - 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  |  ");
            // L
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == (n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  |  ");
            // M
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == (n - 1) || i == j && i <= (n - 1) / 2 || i + j == (n - 1) && i <= (n - 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    public static void N_to_Z(int n) {
        for (int i = 0; i < n; i++) {
            // N
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == (n - 1) || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  |  ");
            // O
            for (int j = 0; j < n; j++) {
                if (j == 0 && i > 0 && i < (n - 1) || i == 0 && j > 0 && j < (n - 1)
                        || j == (n - 1) && i > 0 && i < (n - 1) || i == (n - 1) && j > 0 && j < (n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  |  ");
            // P
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 && j < (n - 1) || j == (n - 1) && i > 0 && i < (n - 1) / 2
                        || i == (n - 1) / 2 && j < (n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  |  ");
            // Q
            for (int j = 0; j < n; j++) {
                if (j == 0 && i > 0 && i < (n - 2) || i == 0 && j > 0 && j < (n - 2)
                        || j == (n - 2) && i > 0 && i < (n - 2) || i == (n - 2) && j > 0 && j < (n - 2)
                        || i == j && j >= (n - 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  |  ");
            // R
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 && j < (n - 1) / 2 || j == (n - 1) / 2 && i > 0 && i < (n - 1) / 2
                        || i == (n - 1) / 2 && j < (n - 1) / 2 || i - j == (n - 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  |  ");
            // S
            for (int j = 0; j < n; j++) {
                if (j == 0 && i > 0 && i < (n - 1) / 2 || i == 0 && j > 0 && j < (n - 1)
                        || i == (n - 1) / 2 && j > 0 && j < (n - 1) || j == (n - 1) && i > (n - 1) / 2 && i < (n - 1)
                        || i == (n - 1) && j > 0 && j < (n - 1) || i == 1 && j == (n - 1) || i == (n - 2) && j == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  |  ");
            // T
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == (n - 1) / 2 && i > 0 && i <= (n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  |  ");
            // U
            for (int j = 0; j < n; j++) {
                if (j == 0 && i < (n - 1) || j == (n - 1) && i < (n - 1) || i == (n - 1) && j > 0 && j < (n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  |  ");
            // V
            for (int j = 0; j < 2 * n; j++) {
                if (i == j || i + j == (2 * n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  |  ");
            // W
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == (n - 1) || i + j == (n - 1) && i >= (n - 1) / 2 || i == j && i >= (n - 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  |  ");
            // X
            for (int j = 0; j < n; j++) {
                if (j == i || i + j == (n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  |  ");
            // Y
            for (int j = 0; j < n; j++) {
                if (j == i && i < (n - 1) / 2 || i + j == (n - 1) && i < (n - 1) / 2
                        || i >= (n - 1) / 2 && j == (n - 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  |  ");
            // Z
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == (n - 1) || i + j == (n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    public static void one_to_ten(int n) {
        for (int i = 0; i < n; i++) {
             // 0
             for (int j = 0; j < n; j++) {
                if (j == 0 && i > 0 && i < (n - 1) || i == 0 && j > 0 && j < (n - 1)
                        || j == (n - 1) && i > 0 && i < (n - 1) 
                        || i == (n - 1) && j > 0 && j < (n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  |  ");
            // 1
            for (int j = 0; j < n; j++) {
                if (j == (n - 1) / 2 || i == (n - 1) || i == 1 && j == (n - 1) / 2 - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  |  ");
            // 2
            for (int j = 0; j < n; j++) {
                if (i == 1 && j == 0 || j > 0 && j < (n - 1) && i == 0 || i > 0 && i + j == (n - 1) || i == (n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  |  ");
            // 3
            for (int j = 0; j < n; j++) {
                if (i == 0 && j < (n - 1) || j == (n - 1) && i > 0 && i < (n - 1) / 2 || i == (n - 1) / 2 && j < (n - 1)
                        || j == (n - 1) && i > (n - 1) / 2 && i < (n - 1) || i == (n - 1) && j < (n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  |  ");
            // 4
            for (int j = 0; j < n; j++) {
                if (i >= 0 && i <= (n - 1) / 2 && j == 0 || i >= 0 && j == (n - 1) || i == (n - 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  |  ");
            // 5
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 && i >= 0 && i <= (n - 1) / 2 || i == (n - 1) / 2 && j >= 0 && j < (n - 1)
                        || j == (n - 1) && i > (n - 1) / 2 && i < (n - 1) || i == (n - 1) && j < (n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  |  ");
            // 6
            for (int j = 0; j < n; j++) {
                if (i == 0 && j > 0 && j < (n - 1) || i == 1 && j == (n - 1) || j == 0 && i > 0 && i < (n - 1)
                        || i == (n - 1) / 2 && j >= 0 && j < (n - 1) || j == (n - 1) && i > (n - 1) / 2 && i < (n - 1)
                        || i == (n - 1) && j > 0 && j < (n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  |  ");
            // 7
            for (int j = 0; j < n; j++) {
                if (i == 0 || i + j == (n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  |  ");
            // 8
            for (int j = 0; j < n; j++) {
                if (j == 0 && i > 0 && i < (n - 1) || i == 0 && j > 0 && j < (n - 1)
                        || j == (n - 1) && i > 0 && i < (n - 1) / 2
                        || i == (n - 1) / 2 && j > 0 && j < (n - 1) || j == (n - 1) && i > (n - 1) / 2 && i < (n - 1)
                        || i == (n - 1) && j > 0 && j < (n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  |  ");
            // 9
            for (int j = 0; j < n; j++) {
                if (j == 0 && i > 0 && i < (n - 1)/2 || i == 0 && j > 0 && j < (n - 1)
                || j == (n - 1) && i > 0 && i < (n - 1) 
                || i == (n - 1) / 2 && j > 0 && j < (n - 1)
                || i == (n - 1) && j >= 0 && j < (n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println();
        A_to_M(7);
        System.out.println();
        N_to_Z(7);
        System.out.println();
        one_to_ten(7);
    }
}
