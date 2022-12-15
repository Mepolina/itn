public class r {
    static void reeevereseArray(int arr[], int start, int end) {
        int t;
        while (start < end) {
            t = arr[start];
            arr[start] = arr[end];
            arr[end] = t;
            start++;
            end--;
        }
    }

    static void printArray(int arr[],
                           int size) {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main(String args[]) {

        int arr[] = {1, 2, 3, 4, 5, 6};
        printArray(arr, 6);
        reeevereseArray(arr, 0, 5);
        System.out.print("Reversed  \n");
        printArray(arr, 6);

    }
}
