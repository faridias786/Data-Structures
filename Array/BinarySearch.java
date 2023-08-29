package Array;

import javax.print.DocFlavor.INPUT_STREAM;

public class BinarySearch {
    public static int search1(int number[], int key) {
        int start = 0;
        int end = number.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (number[mid] == key) {
                return mid;
            }
            if (number[mid] < key) {
                start = mid + 1; // Change start = start + 1; to start = mid + 1;
            } else {
                end = mid - 1; // Change end = end - 1; to end = mid - 1;
            }
        }
        return -1; // Return a default value indicating key not found
    }

    public static void main(String[] args) {
        int number[] = { 1, 2, 3, 4, 5, 6 };
        int key = 5;
        int x = search1(number, key);
        System.out.println(x);
    }
}
