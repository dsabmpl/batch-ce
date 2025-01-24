public class Loops {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Yash " + i);
        }
        int i = 0;
        while (i < 10) {
            if (i == 5)
                break;
            System.out.println("Yash While" + i);
            i++;
        }
        i = 0;
        do {
            System.out.println("Do while" + i);
        } while (i < 10);
    }

}
