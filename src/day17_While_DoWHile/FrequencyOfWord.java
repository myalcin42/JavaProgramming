package day17_While_DoWHile;

public class FrequencyOfWord {
    public static void main(String[] args) {
            String str = "JavaJava";

            int frequency = 0;

        for (int i = 0; i <= str.length() - 4; i++) {
            String eachSub = str.substring(i, i+4);
            if(eachSub.equals("Java")){
                frequency += 1;
            }
        }

             System.out.println(frequency);
    }

}
/*
2. write a program that can return the frequency of the a word Java from the sentence

        Ex:
            sentence = "JavaJavaJava";

            output: 3


           	Str = "JavaJava";
 */