package Arrays;

public class ArrayMul5 {
    public static void main(String[] args) {
        int[][] a=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int size=0;
        for(int i=0;i<a.length;i++){
            size+=a[i].length;
        }
        System.out.println(size);

    }
}
