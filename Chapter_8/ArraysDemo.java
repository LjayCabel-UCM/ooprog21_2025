public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = new int[5];   
        display("Original array:            ", arr);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 8;
        }
        display("After filling with 8s:     ", arr);

        arr[1] = 6;
        arr[4] = 3;
        display("After changing two values: ", arr);

        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        display("After sorting:             ", arr);
    }

    public static void display(String msg, int[] arr) {
        System.out.print(msg + " ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
