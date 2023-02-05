package day23_CustomMethods_Void;

public class CustomMethodsPractice {

    public static void main(String[] args) {

        helloWorld5Times();
        helloCydeo5Times(); // eğer bu metoda ulaşmak istersen Ctrl tuşuna basıp mouse metot üstünde hover edersen metoda tıklayıp o metodun içeriğine ulaşabilirsin
        evenNumbersFrom1To10();
    }


    //create a function that can print hello world 5 times helloWorld5Times();
    public static void helloWorld5Times(){ //custom metotların execute edilebilmesi için mutlaka bir main metotun olması gerekmektedir
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }
    } //metodu oluşturduktan sonra bu şekilde kapatmak faydalı olacaktır (minimize it after creating it)


    //create a function that can print hello Cydeo 5 times
    public static void helloCydeo5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo");
        }
    }

    //create a function that can print all the even numbers from 1 -10
    public static void evenNumbersFrom1To10(){
        for (int i = 1; i <= 10 ; i++) { // ya da for(int i = 2; i < 11 ; i+=2)
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }

}
