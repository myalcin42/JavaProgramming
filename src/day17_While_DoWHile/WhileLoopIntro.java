package day17_While_DoWHile;

public class WhileLoopIntro {
    public static void main(String[] args) {

        if(true){
            System.out.println("Wooden Spoon"); //if statementler koşul doğruysa sadece 1 kere execute edilir.while loop da if statement mantığıyla aynıdır while loop repeated if statement olarak da tanımlanabilir
        }
        System.out.println("-------------------------------------------");

        while(true){
            System.out.println("Wooden Spoon"); //if ifadesini while ile değiştir.Burada koşul ifadesi doğru olduğu için içerisindeki ifadeyi sonsuza kadar yazdırır çünkü ifade hep doğru olacak while(true) olduğu için
        }
            //Koşul sayısı belliyse for loop kullanmak daha uygundur ama koşulun belirli bir ifade false oluncaya kadar işletilmesi durumunda yani tekrar sayısının bilinmemesi durumunda while loop en iyi çözümdür
        //While loopda () içerisinde sadece boolean ifade geçerlidir

    }



}
