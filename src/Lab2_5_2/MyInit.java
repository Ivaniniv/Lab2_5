package Lab2_5_2;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Alex on 22.02.2016.
 */
public class MyInit {
    private int[] arr = new int[10];

    {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
    }

    public void printArray() {
        System.out.println(Arrays.toString(arr));

    }
}
