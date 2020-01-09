//Mark Hooks
//1/7/2020
// this program is made to take a number of random birthdays and calculate the percent of same birthdays.

public class BirthdayParadox {
    public static int[] dates(int numbers){
        // this gets the birthdays
        int[] birthdays = new int[numbers];
        for(int begin = 0; begin < birthdays.length; begin++ ){
            int d = (int)(Math.random() * 365 +1);
            birthdays[begin] = d;
        }
        return birthdays;
    }
    public static boolean hasDupes(int[] birthdays){
        // this part of the program is to check if their are any duplicates in the array of birthdays.
        boolean b = false;
        for(int i = 0; i < birthdays.length; i++){
            for(int y = 0; y< birthdays.length; y++){
                if(i == y && b == false){
                    b = false;
                }else if(birthdays[i] == birthdays[y]){
                    b = true;
                    break;
                }
            }
        }
        return b;
    }
    public static void main(String[] args){
        int num = 1000;
        double y = 0;
        for(int st = 0; st < num; st ++){
            int[] birthday = dates(23);
            boolean b = hasDupes(birthday);
            if(b){
                y++;
            }

        }
        double percent = y/num *100;
        System.out.println("The percent of times there were duplicate birthdays is " + percent + "%" );

    }
}
