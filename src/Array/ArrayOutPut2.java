package Array;

public class ArrayOutPut2 {
    public static void main(String[] args) {
        int [] [] Number = new int[4] [];
        int k = 0;

        Number[0] = new int[1];
        Number[1] = new int[2];
        Number [2] = new int[3];
        Number [3] = new int[4];

        for (int i = 0; i < 4; i++){
            for (int j = 0; j < i+1; j++){
                Number [i] [j] = k;
                k++;
            }
        }
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < i + 1; j++){
                System.out.println(" "+Number [i][j]);
            }
            System.out.println();
        }
    }
}
