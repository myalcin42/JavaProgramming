package day17_While_DoWHile;

public class FrequencyOfWord2 {

    public static void main(String[] args) {

        String str = "Cat Cat Dog Dog cAt CaT caT";

        int frequency = 0;
                        //Buradaki -3 rakamını(yani kelime kaç harfliyse) vermezsek out of range hatası verecektir
        for (int i = 0; i <= str.length() - 3; i++) {
            String eachSub = str.substring(i, i+3);
            if(eachSub.equalsIgnoreCase("Cat")){
                frequency += 1;
            }
        }

        System.out.println(frequency);



    }



}
