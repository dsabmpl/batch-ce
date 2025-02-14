public class Fact {
    static void fact(int num, int ans) {
        if (num == 1) {
            System.out.println("The Factorial is : " + ans);
            return;
        }
        // int ans = 1;
        // for (int i = 2; i <= num; i++) {
        // ans = ans * i;
        // }
        ans *= num;
        fact(num - 1, ans);

    }

    static int fact(int num) {
        if (num == 1)
            return 1;
        int ans = fact(num - 1);
        return ans * num;
    }

    public static void main(String[] args) {
        int num = 5;
        fact(num, 1);
        int ans = fact(num);
        System.out.println(ans);

    }

}
