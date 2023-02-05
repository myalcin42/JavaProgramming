package day42_Exceptions;

public class MorningWorkOut {

    public static void main(String[] args) {

        System.out.println("-------------Push up started-------------------");

        for (int i = 1; i <= 30 ; i++) {

         //   System.out.println("Push up " + i); bu şekilde yazarsak her ifadeyi yeni bir satırda yazar ama aşağıdaki şekilde yazıp escape sequences kullanırsak her ifadeyi aynı satıra değiştirerek yazar
            System.out.println("\rPush up " + i);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\n-------------Push up completed-------------------");

        System.out.println("-------------Pull up started-------------------");

        for (int i = 1; i <= 20 ; i++) {

            //   System.out.println("Push up " + i); bu şekilde yazarsak her ifadeyi yeni bir satırda yazar ama aşağıdaki şekilde yazıp escape sequences kullanırsak her ifadeyi aynı satıra değiştirerek yazar
            System.out.println("\rPull up " + i);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\n-------------Pull up completed-------------------");


    }

        public static void sleep(double seconds){ //her sleep metodunu çağırdığımızda checked expection ile karşılaştığımız için her defasında try catch yapıp handle etmektense bu şekilde custom metot oluşturup bir defa handle etmek daha mantıklı
            try {
                Thread.sleep((long)(seconds * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

}
/*
MorningWorkOut:
			1. Do 30 push-ups and try pausing 1.5 seconds in each


			2. Do 20 Pull-ups and try pausing 2.5 seconds in each

 */