public class Patterns {
    public static void squarePatterns(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("    ");

            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1 || i % 2 == 0 || j % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("    ");

            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1 || i == 2 && j >= 2 && j <= n - 3
                        || i == 6 && j >= 2 && j <= n - 3 || j == 2 && i >= 2 && i <= n - 3
                        || j == 6 && i >= 2 && i <= n - 3 || i == (n - 1) / 2 && j == (n - 1) / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("    ");

            for (int j = 0; j < n; j++) {
                if (i == ((n - 1) / 4) || j == ((n - 1) / 4) || i == 3 * (n - 1) / 4 || j == 3 * (n - 1) / 4) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("    ");

            for (int j = 0; j < n; j++) {
                if (i <= ((n - 1) / 4) || j <= ((n - 1) / 4) || i >= 3 * (n - 1) / 4 || j >= 3 * (n - 1) / 4) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("    ");

            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1 || i == ((n - 1) / 4) || j == ((n - 1) / 4)
                        || i == 3 * (n - 1) / 4 || j == 3 * (n - 1) / 4) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("    ");

            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1 || i <= ((n - 1) / 4) && j <= ((n - 1) / 4)
                        || i >= 3 * (n - 1) / 4 && j >= 3 * (n - 1) / 4 ||
                        i <= ((n - 1) / 4) && j >= 3 * (n - 1) / 4 || i >= 3 * (n - 1) / 4 && j <= ((n - 1) / 4)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("    ");

            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1 || i <= ((n - 1) / 4) && j <= ((n - 1) / 4)
                        || i >= 3 * (n - 1) / 4 && j >= 3 * (n - 1) / 4 ||
                        i <= ((n - 1) / 4) && j >= 3 * (n - 1) / 4 || i >= 3 * (n - 1) / 4 && j <= ((n - 1) / 4)
                        || i == (n - 1) / 2 || j == (n - 1) / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("    ");

            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1 || i == (n - 1) / 2 || j == (n - 1) / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }

    public static void trianglePattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i +j== n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("    ");

            for (int j = 0; j < n; j++) {
                if (i == j || i +j== n - 1 || i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.print("    ");

            for (int j = 0; j < n; j++) {
                if (i <= j && i +j>= n - 1 || i >= j && i +j<= n - 1 || i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("    ");

            for (int j = 0; j < n; j++) {
                if (i+j== (n - 1 )/2 || i-j== (n - 1 )/2 || j-i== (n - 1 )/2 || j+i== (n - 1 )+(n - 1 )/2 ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("    ");

            for (int j = 0; j < n; j++) {
                if (i+j== (n - 1 )/2 || i-j== (n - 1 )/2 || j-i== (n - 1 )/2 || j+i== (n - 1 )+(n - 1 )/2 || i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("    ");

            for (int j = 0; j < n; j++) {
                if (i+j<= (n - 1 )/2 || i-j>= (n - 1 )/2 || j-i>= (n - 1 )/2 || j+i>= (n - 1 )+(n - 1 )/2 || i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("    ");
            
            for (int j = 0; j < n; j++) {
                if ( i==j ||  i+j==n-1 ||i+j== (n - 1 )/2 || i-j== (n - 1 )/2 || j-i== (n - 1 )/2 || j+i== (n - 1 )+(n - 1 )/2 || i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("    ");
            
            for (int j = 0; j < n; j++) {
                if ( i==0||j==0||i==n-1||j==n-1|| i<=(n-1)/2 && j<=(n-1)/2 ||i>=(n-1)/2 && j>=(n-1)/2 ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("    ");
            
            for (int j = 0; j < n; j++) {
                if ( i==(n-1)/2 &&j<=i ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println();
        squarePatterns(9);
        System.out.println();
        trianglePattern(9);
       
    }
}