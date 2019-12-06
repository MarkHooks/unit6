public class ArrayCreation {
    public static double getAverage(double[] numbers){
        if(numbers.length<3)
            return 0.0;
        else {
            double first = numbers[0];
            int middle = numbers.length/2 ;
            double mid = numbers[middle];
            double last = numbers[numbers.length -1];
            double avg = (first +mid + last)/ 3;
            return avg;
        }
    }
    public static String stringArray(String[] friends){
        String str = "";
        if(friends.length!= 5){
            str+="";
            return str;
        }else {
            str += friends[0].length()+ " ";
            str += friends[1].length()+ " ";
            str += friends[2].length()+ " ";
            str += friends[3].length()+ " ";
            str += friends[4].length()+ " ";
        }
        return str;
    }
    public static  String countryData(){
        String[] countries = {"China", "Egypt", "France", "South Korea", "Germany", "India", "Japan", "Ghana", "Kenya", "Mexico", "United Kingdom", "Burkina Faso", "United States"};

        String[] capitals = {"Beijing", "Cairo", "Paris", "Seoul", "Berlin", "New Delhi", "Tokyo", "Accra", "Nairobi", "Mexico City", "London", "Ouagadougou", "Washington D.C."};

        String[] languages = {"Mandarin", "Arabic", "French", "Korean", "German", "Hindi", "Japanese", "Akuapem Twi", "Swahili", "Spanish", "English", "French", "English"};
        int randomcountries = (int) (Math.random()* countries.length);
        return "The capital of " + countries[randomcountries] + " is " + capitals[randomcountries]+" the language is " + languages[randomcountries];

    }
    public static void main(String[] args){
        double[] numbers = {89, 75, 100};
        System.out.println(getAverage(numbers));
        String[] names = {"Fred", "Barney", "Betty", "Wilma", "Pebbles"};
        System.out.println(stringArray(names));
        System.out.println(countryData());



    }
}
