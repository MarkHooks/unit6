public class ArrayAlgorithms {
    public static String printArray(int[] nums){
        String str = "";
        for(int i = 0; i< nums.length; i++){
            str += nums[i] + " ";
        }
        return str;
    }
    public static boolean checkForAllNegatives(int[] list){
        boolean negative = false;
        for(int i = 0; i < list.length; i++){
            if(list[i]>=0){
                negative = false;
            }
        }
        return negative;
    }
    public static boolean hasDupes(int[] list){
        boolean dupe = false;
        for(int i = 0; i < list.length; i++){
            for(int x = 0; x<list.length; x++){
                if(i == x) {
                    dupe = false;
                }
                else if(list[x] == list[i]){
                    dupe = true;
                    break;
            }
            }
        }
        return dupe;
    }
    public static int countEvens(int[] arr) {
        int possitive = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                possitive++;
            }
        }
        return possitive;
    }
    public static int[] leftShift(int[] num, int lshift){
        int[] newarr = new int[num.length + lshift];
        for(int i = 0; i<num.length; i++){
            newarr[i] = num[i];
        }
        for(int i = num.length; i<num.length + lshift; i++){
            newarr[i] = 0;
        }
        return newarr;
    }
    public static String reverseArray(int[] arr){
        int ar;
        int last = arr.length -1;
        for(int start = 0; start<(arr.length / 2); start++ ){
            ar = arr[last];
            arr[last] = arr[start];
            arr[start] = ar;
            last--;

        }
        return printArray(arr);
    }
    public static void main(String[] args){
        int[] list1 = {-2, -9, -6, -8, -9, -3, -1};
        System.out.println(printArray(list1));

        int[] lista = {-2, -9, -6, -8, -9, -3, -1};
        int[] list2 = {-2, -9, -6, -8, -9, -3, 0};
        System.out.println(checkForAllNegatives(lista));
        System.out.println(checkForAllNegatives(list2));

        int[] listb = {5, 23, 7, 14, 39, 46, 52, 65, 75, 83, 76, 44, 90, 6, 2, 5};
        int[] listc = {5, 23, 7, 14, 39, 46, 52, 65, 75, 83, 76, 44, 90, 6, 2, 11};
        System.out.println(hasDupes(listb));
        System.out.println(hasDupes(listc));

        int[] listd = {1, 0, 1, 1, 0, 1, 0, 1};
        System.out.println(printArray(leftShift(list1, 6)));

        System.out.println(reverseArray(listd));
    }

}
