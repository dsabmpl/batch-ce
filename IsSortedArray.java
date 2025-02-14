public class IsSortedArray {
    static void isSorted(int[] arr, int i, int n) {
        if (i == n) {
            System.out.println("The Array is Sorted");
            return;
        }

        if (arr[i] > arr[i + 1]) {
            System.out.println("The Array is Not Sorted");
            return;
        }

        isSorted(arr, i + 1, n);

    }

    static boolean isSortedB(int[] arr, int i, int n) {
        if (i == n) {
            return true;
        }

        if (arr[i] > arr[i + 1]) {

            return false;
        }
        return isSortedB(arr, i + 1, n);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 3, 5, 6, 7 };
        isSorted(arr, 0, arr.length - 1);
        System.out.println(isSortedB(arr, 0, arr.length - 1));

    }
}
