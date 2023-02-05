package day17_While_DoWHile;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "AABBCC";

        String result = "";  //expected output "ABC"

        for (int i = 0 ; i < str.length() ; i++ ){
            String ch ="" + str.charAt(i); // "A" , "A" , "B" , "B" , "C" , "C"
                    //  char data tipinden Stringe çevirdik ki metot uygulayabilelim
            if(result.contains(ch)){
                continue; //result karakteri içeriyorsa bu adımı atla demektir.Çünkü amaç tekrarlanan karakteri tekrar yazdırmamak
            }
            result += ch;

        }
            System.out.println(result);

    }


}
