public class Tree {

    static void tree(int num) {
        if (num <= 0)
            return;

        System.out.println("Pre call " + num);
        tree(num - 1);
        System.out.println("Mid Call " + num);
        tree(num - 2);
        System.out.println("Post Call " + num);
    }

    public static void main(String[] args) {
        int num = 3;
        tree(num);
    }

}
