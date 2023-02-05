package day17_While_DoWHile;

public class FrequencyOfWord_WhileLoop {
    public static void main(String[] args) {

        String str = "Java Java Python Python";
        int freqency = 0; //java kelimesi kaç defa tekrarlanmış bul

        while(str.contains("Java")){
            str = str.replaceFirst("Java", "");
            freqency++;
        }

        System.out.println(freqency);

        System.out.println("----------------------------------------");

        String sentence = "cat cat cat cat dog dog dog cat cat";
        sentence = sentence.toLowerCase();
        int countCat = 0;

        while(sentence.contains("cat")){
            sentence = sentence.replaceFirst("cat", "");
            countCat += 1;
        }

        System.out.println(countCat);

        System.out.println("------------------------------------");

        String s = "java java java python python python";

        int countJava = 0;
        int countPython = 0;

        while(s.contains("java") || s.contains("python")){

            if(s.contains("java")){
                s= s.replaceFirst("java","");
                countJava++;
            }
            if(s.contains("python")){
                s= s.replaceFirst("python","");
                countPython++;
            }

            System.out.println("countJava = " + countJava);
            System.out.println("countPython = " + countPython);
            //Tek bir while loop döngüsünde cümlenin iki farklı kelimeyi içerip içermediğini bulmak için çözüm
        }



    }



}
