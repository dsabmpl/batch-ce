import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        outerLoop: for (int i = 0; i < n; i++) {
            // System.out.println(i);
            for (int j = 0; j < n; j++) {
                if (i == 1)
                    break outerLoop;
                System.out.println(j);

            }
        }
    }

}
