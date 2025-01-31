public class FlipDigits {
    static int flip(int num) {
        int pos = 1, answer = 0;
        while (num > 0) {
            int last = num % 10;
            answer += pos * Math.pow(10, last - 1);
            num = num / 10;
            pos++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int num = 32145;
        System.out.println(flip(num));
    }

}
