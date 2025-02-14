public class RecursivePattern {

    static void printStar(int num) {
        if (num == 0)
            return;
        System.out.print("*");
        printStar(num - 1);
    }

    static void printRow(int num) {
        if (num == 0)
            return;
        printRow(num - 1);
        printStar(num);
        System.out.println();

    }

    public static void main(String[] args) {
        int num = 5;
        printRow(num);
    }

}
