package Arrays;

public class ArrayMul {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;
        arr[2][0] = 7;
        arr[2][1] = 8;
        arr[2][2] = 9;
        for (int i = 0; i < arr.length; i++) {
            int [] singleRow=arr[i];
            for (int j = 0; j < singleRow.length; j++) {
                System.out.print(singleRow[j]+" ");
            }
            System.out.println();
        }
    }
}
