public class RightTriangle {
    static void printRightTriangleWithSpaces(int num) {
        for (int row = 1; row <= num; row++) {
            for (int spaces = 1; spaces <= num - row; spaces++) {
                System.out.print(" ");
            }

            for (int stars = 1; stars <= row; stars++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void printPyramid(int num) {
        for (int row = 1; row <= num; row++) {
            for (int spaces = 1; spaces <= num - row; spaces++) {
                System.out.print(" ");
            }
            for (int stars = 1; stars <= 2 * row - 1; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void printReversePyramid(int num) {
        for (int row = 1; row <= num; row++) {
            for (int spaces = 1; spaces < row; spaces++) {
                System.out.print(" ");
            }

            for (int stars = 1; stars <= ((2 * num) - (2 * row) + 1); stars++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void printReverseRightTriangleWithSpaces(int num) {
        for (int row = 1; row <= num; row++) {
            for (int stars = 1; stars <= row - 1; stars++) {
                System.out.print(" ");
            }

            for (int spaces = 1; spaces <= num - row + 1; spaces++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void printReverseRightTriangle(int num) {
        for (int row = 1; row <= num; row++) {
            for (int stars = 1; stars <= num - row + 1; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void printRightTriangle(int n) {
        for (int row = 0; row < n; row++) {
            for (int stars = 0; stars <= row; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        // printRightTriangle(n);
        // printReverseRightTriangle(n);
        // printRightTriangleWithSpaces(n);
        // printReverseRightTriangleWithSpaces(n);
        // printPyramid(n);
        printReversePyramid(n);

    }

}
