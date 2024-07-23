package Arrays;

public class Array6 {
    public static void main(String[] args) {
        String[] arr = new String[5];
        arr[0]="nissan";
        arr[1]="BMW";
        arr[2]="Hondha";
        arr[3]="FORD";
        arr[4]="Samsung";
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
