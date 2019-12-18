import java.util.Scanner;

public class ArrayTraversalExervises {
    static Scanner scan = new Scanner(System.in);
    public static int countEven(int[] x){
        int even = 0;
        int [] a = new int[x.length ];
        for(int y = 1; y<x.length; y++){
            if(x[y]%2 == 0){
                even ++;
            }
        }
        return even;
    }
    public static int buildArray(int n){
        int[] arr = {};
        int x = 0;
        for(int i = 1; i <n; i++){
        }
        return 1;
    }

    public static void main(String[] args){
        int [] num = {2, 1, 2, 3, 4};
        System.out.println(countEven(num));
    }
}
