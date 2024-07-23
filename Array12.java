package Arrays;

public class Array12 {
    public static void main(String[] args) {
        int a[] = {50, 30, 40, 20, 60};
        int max = a[0];//50
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {//50>30,50>40,20>50,

                    max = a[i];
                }
            }
        System.out.println(max);
        }
    }

