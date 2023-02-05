package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {

        /*
        90 - 100 excellent
        80 - 89 great
        70 - 79 good
        60 - 69 passed
        0 - 59 failed
        not 0 ile 100 arasında bir rakam olması gerekir o yüzden önkoşul var ve nested 
        if kullanılır
         */
        int score = 95;
        
        if(score >= 0 && score <=100){ // if the score is valid number (pre-condition)
            
            if(score >= 90){ //100 den küçük olması gerektiği zaten önkoşulda kontrol edildi
                System.out.println("Excellent");
            } else if (score >= 80) { // Notun 90 dan küçük olması durumunda bu koşula
                //bakılacağı için tekrar 90 dan küçük olması şartının yazılmasına gerek yok
                System.out.println("Great");
            } else if (score >= 70) {
                System.out.println("Good");
            } else if (score >= 60) {
                System.out.println("Passed");
            }else{
                System.out.println("Failed");
            }

        }else{ //if the score is not valid
            System.out.println("Invalid Score");
        }

        System.out.println("-------------------------------------------");
        //Eğer tek bir print statement ifadesi ile yazdırmak istersek çözümü bu şekilde
        String result = ""; //Muhtarın önerisi bu şekilde declare yaptıktan
        //sonra boş karakter de olsa bir değer atamak iyi olur sonrasında
        //hata verebilir
        if(score >= 0 && score <=100){ // if the score is valid number (pre-condition)

            if(score >= 90){ //100 den küçük olması gerektiği zaten önkoşulda kontrol edildi
                result = "Excellent";
            } else if (score >= 80) { // Notun 90 dan küçük olması durumunda bu koşula
                //bakılacağı için tekrar 90 dan küçük olması şartının yazılmasına gerek yok
                result = "Great";
            } else if (score >= 70) {
               result = "Good";
            } else if (score >= 60) {
                result = "Passed";
            }else{
                result = "Failed";
            }

        }else{ //if the score is not valid
            result = "Invalid Score";
        }

        System.out.println("result = " + result);
        
    }


}
