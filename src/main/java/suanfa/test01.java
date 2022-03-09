package suanfa;

import java.util.Arrays;

public class test01 {


    public static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void selectionSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, minIndex, i);
        }
        Arrays.stream(arr).forEach(s -> System.out.println(s));
    }

    public static void bublleSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

    }


    public static void main(String[] args) {
        int[] arr = {3, 54, 46, 123, 134, 1, 6};
        test01.selectionSort(arr);

    }
}
