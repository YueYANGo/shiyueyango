import java.util.Arrays;

/**
 * @author YueYang
 * Created on 2025/1/15 11:45
 * @version 1.0
 */




public class test {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;


        for(int i = 0; i<10; i++){
            System.out.println(i);
        }


        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        Arrays.toString(arr);
        int d = eat();
        System.out.println(d);
    }



    public static int  eat(){

        System.out.println("1------------");
        System.out.println("2------------");
        System.out.println("3------------");
        System.out.println("4------------");
        System.out.println("5------------");
        return 10;
    }
}
