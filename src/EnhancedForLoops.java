public class EnhancedForLoops {
    public static String printStandardFor(String[] arr){
        String str = "";
        for(int i = 0; i <= arr.length; i++){
            str += arr[i] + " ";
        }
        return str;
    }

    public static String printStandardFor(int[] arr){
        String str = "";
        for(int i = 0; i <= arr.length; i++){
            str += arr[i] + " ";
        }
        return str;
    }

    public static String printStandardFor(double[] arr) {
        String str = "";
        for(int i = 0; i <= arr.length; i++){
            str += arr[i] + " ";
        }
        return str;
    }

    public static String printEnhancedFor(String[] arr){
        String str = "";
        for(int i = 0; i <= arr.length; i++){
            str += arr[i] + " ";
        }
        return str;
    }

    public static String printEnhancedFor(int[] arr){
        String str = "";
        for(int i = 0; i <= arr.length; i++){
            str += arr[i] + " ";
        }
        return str;
    }

    public static String printEnhancedFor(double[] arr){
        String str = "";
        for(int i = 0; i <= arr.length; i++){
            str += arr[i] + " ";
        }
        return str;
    }

    public static String printStandardWhile(String[] arr) {
        String str = "";
        for(String i : arr){
            str += i + " ";
        }
        return str;
    }


    public static String printStandardWhile(int[] arr) {
        String str = "";
        for(int i : arr){
            str += i + " ";
        }
        return str;
    }

    public static String printStandardWhile(double[] arr) {
        String str = "";
        for(double i : arr){
            str += i + " ";
        }
        return str;
    }
    public static void main(String[] args){
        int[] list = {7, 5, 3, 8, 11, -4, 0, -2};
        double[] doubleList = {6.5, 4.7, -2.4, 0.0, -8, 3.14, -12};
        String[] strList = {"Sporty", "Scary", "Baby", "Posh", "Ginger"};
        System.out.println(printStandardFor(list));
        System.out.println(printEnhancedFor(list));
        System.out.println(printStandardWhile(list));
        System.out.println(printStandardFor(doubleList));
        System.out.println(printEnhancedFor(doubleList));
        System.out.println(printStandardWhile(doubleList));
        System.out.println(printStandardFor(strList));
        System.out.println(printEnhancedFor(strList));
        System.out.println(printStandardWhile(strList));

    }

}
