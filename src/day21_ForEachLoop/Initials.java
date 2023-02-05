package day21_ForEachLoop;

public class Initials {

    public static void main(String[] args) {

        String[] names = {"Munur Saracoglu", "Zubeyr Develi", "Kursad Sezgin", "Ersin Samur", "Serkan Nemli", "Mehmet Usta", "Harun Gumus", "Talha Demir", "Hasan Ali Aksoy", "Ozer Ozturk"};

        for(String each : names ){
            String initial = each.charAt(0) + "." + each.charAt(each.indexOf(" ") + 1);
            System.out.println(initial);
        }






    }


}
