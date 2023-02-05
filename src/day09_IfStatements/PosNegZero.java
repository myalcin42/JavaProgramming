package day09_IfStatements;

public class PosNegZero {

    public static void main(String[] args) {
        //Multi Branch if örnek task
        int n = 100;//bu sayı pozitif,negatif ya da 0 olabilir ysni üç olasılık var
        /* // bu şekilde bağımsız single if formatında bu görevi yaparsak compiler
        bütün if koşullarını kontrol eder hemen sonuca ulaşsa bile.Bu compilera fazla
        görev yükler (wasting the source) Bu yüzden 1 olasılıktan fazla koşul durumlarında
        single if kullanma!iki koşul varsa if else, 3 ya da daha fazla koşul varsa
        multi branch if kullan!
        if(n > 0){
            System.out.println("Positive");
        }
        if (n < 0){
            System.out.println("Negative");
        }
        if (n == 0){
            System.out.println("Zero");
        }
        */
        boolean positive = n > 0;
        boolean negative = n < 0;


        if(positive){  // bu formatta compiler doğruyu yakaladığı anda diğer koşulları
            //kontrol etmeyi bırakır
            System.out.println("Positive");
        } else if (negative) {
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
        // 12 olasılık olsa mesela 1 tane if, 1 tane else olur diğerleri else if olur
        //bu formatta sırayı değiştirme.if - else if - else

        /*
        yukarıdaki örneği aşağıdaki gibi yapabilir miyiz
        if(positive){
              System.out.println("Positive");
              }
        if (negative) {
            System.out.println("Negative");
            }else{
                System.out.println("Zero");
           İki koşuldan fazla koşul varsa if and else kesinlikle kullanılmaz
           Buradaki formatta iki tane independent if statement var
           Eğer sayı 100 ise mesela compiler ilk önce ilk if ifadesine bakar ve onun doğru
           olduğunu görür.Fakat aşağıda bir tane daha bağımsız if ifadesi olduğu için
           compiler onu da araştırır ve mesela sayı 100 olduğu için ve negatif olmadığı için
           if(negative) ifadesini atlar ama else ifadesi olduğu için onu otomatik olarak
           kabul eder(if değilse else olur kuralı) Burada çıktı Positive
                                                                Zero olur ve yanlıştır

    !!!!!!!       Eğer 1 tane koşul ifadesi oluşturmak istiyorsan if formatı
                  Eğer 2 tane koşul ifadesi oluşturmak istiyorsan if and else formatı
                  Eğer 3 ve daha fazla koşul ifadesi oluşturmak istiyorsan multi branch if formatı

         */

    }


}
