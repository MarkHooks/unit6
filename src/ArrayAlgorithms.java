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
            if(list[i]<0){
                negative = true;
            }
        }
        return negative;
    }
    public static boolean hasDupes(int[] list){
        boolean dupe = false;
        int x = 0;
        for(int i = 0; i < list.length; i++){
            x++;
            if(list[x] == list[i]){
                dupe = true;
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

}
