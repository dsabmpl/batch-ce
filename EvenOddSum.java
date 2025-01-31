public class EvenOddSum {
    static void evenOddSum(int num) {
        int pos = 1, evenSum = 0, oddSum = 0;
        while (num > 0) {
            int last = num % 10;
            if (pos % 2 == 0) {
                evenSum += last;
            } else {
                oddSum += last;
            }
            num /= 10;
            pos++;

        }

        System.out.println("Even Sum is " + evenSum);
        System.out.println("Odd SUm is " + oddSum);
    }

    public static void main(String[] args) {
        int num = 1234;
        evenOddSum(num);

    }

}
