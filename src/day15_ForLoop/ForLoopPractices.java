package day15_ForLoop;

public class ForLoopPractices {

    public static void main(String[] args) {

        //15 den 45 e kadar rakamları yanyana arada boşluk olacak şekilde yazdır

        for (int i = 15 ; i <= 45 ; i++){
            System.out.print(i + " ");
        }

        System.out.println("\nHello");

        // 100 den 50 ye kadar sayıları yanyana yaz

        for (int i = 100 ; i >= 50 ; i--){
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("----------------------------------------------");

        // print all the even numbers between 1 - 55

        for (int i = 1 ; i <= 55 ; i++) { //Buradaki int i variable for loop bloku
            //dışında kullanılamaz
            if(i % 2 == 0){
                System.out.print(i + " ");
            }

        }

        System.out.println();

        System.out.println("----------------------------------------");

        //// print all the even numbers between 1 - 55

        for (int i = 2 ; i <= 54 ; i += 2){ //bu da başka bir yöntem
            System.out.print(i + " ");
        }

    }


}
