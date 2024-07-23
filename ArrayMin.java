package Arrays;

public class ArrayMin {
    public static void main(String[] args) {
        int i[]={50, 100, 40, 20, 60};
        int min=i[0];
        for(int j=1;j<i.length;j++){
            if(i[j]<min){ // 100<50,40<50,40<20,20<40
                min=i[j]; //20
            }
        }
        System.out.println(min);
    }
}
