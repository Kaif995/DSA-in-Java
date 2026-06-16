import java.util.*;

public class Main {

    static void linearSearch(int[] arr, int target) {
        boolean found = false;

        System.out.print("Found at index: ");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.print(i + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.print("Not found");
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 2, 9, 2, 1};

        linearSearch(arr, 2);
    }
}