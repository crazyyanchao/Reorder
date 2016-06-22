package reorder;

/**
  * Created by root on 16-6-23.
  */

public class Reorder {

    public static void main(String[] args) {
        int[] list = { 1, 2, 3, 8, 10, 4, 7 };
        reorderOddEven(list);
    }
    public static void reorderOddEven(int[] list) {
        int length = list.length;
        for (int i = 0; i < length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.print("\n");
        int begin = 0;
        int end = length - 1;
        while (begin < end) {
            while (begin < end && (list[begin] & 0x1) != 0)
                begin++;
            while (begin < end && (list[end] & 0x1) == 0)
                end--;
            if (begin < end) {
                int temp = list[begin];
                list[begin] = list[end];
                list[end] = temp;
            }
        }
        for (int i = 0; i < length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
