package Array;

public class ArrayOutPut {
    public static void main(String[] args) {
        int [] [] Number = new int[4][5] ;
        int k = 0;

        // Assign the value to the second Array
        for (int i = 0; i < 4; i++){
            for (int j = 0 ; j < 5; j++){
                Number [i] [j] = k;
                k++;
            }
        }
        // Printing The Elements

        for (int i = 0; i < 4; i++){
            for (int j = 0 ; j < 5; j++){
                System.out.println(Number [i] [j]);
            }
        }
    }
}
