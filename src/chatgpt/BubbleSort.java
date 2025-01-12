package chatgpt;

/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 19 version
 * Date: 24-Jan-23
 */
public class BubbleSort {
    static void bubble(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int flag = 0;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = 1;
                }
                if (flag == 0)
                    break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {14, 35, 7958, 26, 24};
//        int a = 75;
//        System.out.println(Integer.toString(a));
//        System.out.println();
        bubble(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");

        }


    }
}
