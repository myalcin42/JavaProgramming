package day19_LoopPractices;

public class ExitMethod {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            if(i == 3){
                //break; // sadece loopu terminate eder
                //continue; //sadece belirtilen iterasyonu atlar loop devam eder
                //ama hem break hem de continue loop dışındaki bir ifadenin execute edilmesini engelleyemez

                System.exit(0); //Bu komut ise koşul sağlandığında bütün programı terminate eder sadece loop değil.Yani bu komuttan sonraki bütün ifadeler işlevsiz hale gelir.Terminates everything!!!!
            }
            System.out.println(i);
        }

        System.out.println("Wooden Spoon");

    }


}
