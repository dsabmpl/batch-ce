public class SqarePattern {
    static void printSquare(int n) {
        for (int row = 0; row < n; row++) {
            for (int stars = 0; stars < n; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void printHollowSquare(int n) {
        for (int row = 0; row < n; row++) {
            for (int stars = 0; stars < n; stars++) {
                if (row == 0) {
                    System.out.print("*");
                } else if (row == n - 1) {
                    System.out.print("*");
                } else if (stars == 0) {
                    System.out.print("*");
                } else if (stars == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        // printSquare(n);
        printHollowSquare(n);

    }

}
