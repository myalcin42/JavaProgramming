package day21_ForEachLoop;

public class ForEachLoopIntro {

    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50,60,70};

        //eğer bir arrayin içerisindeki bütün elementlere ulaşmak istersek for each loop kullanılabilir.Bu loop türünde koşul ve başlangıç belirlemeye gerek yoktur arrayin başından sonuna kadar döngü devam eder ve kendiliğinden sona erer.ınfinite loop gibi bişey söz konusu değildir.Eğer Array dizisi içerisinde belirli bir indeksten başlamak istersek bu loop türü kullanılmaz.Bu loop sadece başlangıçtan sona kadar (ne bir eksik ne de bir fazla) array elementlerini getirir

        for (int i = 0; i < numbers.length; i++) { // i: indexes of the array

            int eachElement = numbers[i];
            System.out.println(eachElement);
        }//normal for loopta bu şekilde ulaşılır elementlere ama for each loop bu işlem için daha hızlıdır

        System.out.println("-------------------------------------------------");

        for (int each : numbers){ //each : elements of the array
            System.out.println(each); //for each loop nested loop içerisinde de kullanılabilir
        }



    }

}
