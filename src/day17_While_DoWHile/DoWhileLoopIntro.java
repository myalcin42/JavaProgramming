package day17_While_DoWHile;

public class DoWhileLoopIntro {
    public static void main(String[] args) {
        boolean a = false;

        for(int i = 0 ; a;){
            System.out.println("Wooden Spoon -- for loop");
        }

        while(a){ //while loopda () içerisindeki ifade true değilse kesinlikle execute edilmez önce koşul kontrol edilir
            System.out.println("Wooden Spoon -- while loop");
        }

        System.out.println("-------------------------------------");

        do{ //do while da önce do içerisindeki ifade execute edilir daha sonra koşul kontrol edilir koşul doğruysa do bloku tekrar execute edilir yani interviewlarda sorulursa hangi loop en az bir kez defa execute edilir diye cevap do while olur çünkü önce do bloku execute edilir daha sonra koşul kontrol edilir
            System.out.println("Wooden Spoon -- do while loop");
        }while(a);

        //for loop ve while loop için koşul false ise execute edilmesi mümkün değildir ama do while loop için önce do bloku execute edilir sonra while içerisindeki koşul kontrol edilir.Kullanımı çok yaygın değildir
    }

}
