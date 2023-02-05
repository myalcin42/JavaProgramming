package day17_While_DoWHile;

import java.util.Scanner;

public class BranchingStatements {
    public static void main(String[] args) {

        for(char i = 'A'; i <= 'Z'; i++){
            if(i == 'F'){ //Normalde A dan Z ye kadar yazdırır ama E den sonra yazdırmayı durdursun dersek break ifadesini kullanırız
                break; //exits the loop

            }
            System.out.print(i + " ");
            //Bu ifade de F karakterine kadar (F hariç) yazdırmak istediğimiz için print ifadesini koşuldan sonra yazdık eğer if(i == 'F') bu ifadeyi print den sonra yazarsak compiler yukarıdan aşağıya doğru çalıştığı için önce F harfini de yazdırır sonra koşul yanlış olacağı için loop durur
        }
            System.out.println();
            System.out.println("-----------------------------------");

            Scanner scan = new Scanner(System.in);

             while(true){
                System.out.println("Enter a number");
                int num = scan.nextInt();

                if(num < 0){
                    break; //bu infinite loop eğer kullanıcı negatif bir sayı girerse sona erer break ifadesi bu işe yarar
                }
            }
    }


}
