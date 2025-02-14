public class RevrseString {
    static String reverse(String str) {
        if (str.length() == 1) {
            return str;
        }
        String result = reverse(str.substring(1));
        return result + str.charAt(0);
    }

    public static void main(String[] args) {
        String str = "AMIT";
        System.out.println(reverse(str));
    }

}
