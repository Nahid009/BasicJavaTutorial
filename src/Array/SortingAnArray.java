package Array;

import java.util.Arrays;

public class SortingAnArray {
    public static void main(String[] args) {
        int [] number = {10, -3, 18, 5, 25};

        Arrays.sort(number);

        for (int i = 0; i < 5; i++){
            System.out.println("Ascending "+number[i]);
        }
        System.out.println();

        for (int i = 4;  i >= 0; i--){
            System.out.println("Descending "+ number[i]);
        }
    }
}
