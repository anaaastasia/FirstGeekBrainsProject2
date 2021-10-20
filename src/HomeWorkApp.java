import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkApp {
    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        NewArray();
    }

    public static void invertArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++)
        if (arr[i] == 1) {
            arr[i] = 0;
        } else {
            arr[i] = 1;

            System.out.println(Arrays.toString(arr));
        }
    }

    public static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) ;
            {
                System.out.println(arr[i] = i * 2);
            }

        }
    }

    public static void fillDiagonal() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++)
            arr[i][i] = 1; {
        }
    }

    public static int[] NewArray(int initialValue, int Len)
    {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = initialValue;
        }
        return arr;

}




















