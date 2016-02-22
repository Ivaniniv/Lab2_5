package Lab2_5_3;

import java.util.Arrays;

public class MyInit {
    private static int[] arr = new int[10];

    static {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
    }

    public static void printArray() {
        System.out.println(Arrays.toString(arr));

    }
}
