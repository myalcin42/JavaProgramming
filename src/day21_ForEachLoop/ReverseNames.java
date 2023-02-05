package day21_ForEachLoop;

public class ReverseNames {

    public static void main(String[] args) {

        String[] names = {"Munur Saracoglu", "Zubeyr Develi", "Kursad Sezgin", "Ersin Samur", "Serkan Nemli", "Mehmet Usta", "Harun Gumus", "Talha Demir", "Hasan Ali Aksoy", "Ozer Ozturk"};

        for(String each : names){

            String reverse = "";

            for (int i = each.length() - 1; i >= 0 ; i--) {

                reverse += each.charAt(i);
            }

            System.out.println(reverse);
        }



    }


}
