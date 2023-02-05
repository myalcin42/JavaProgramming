package day20_Arrays;

public class MaxNumberOfArray {

    public static void main(String[] args) {

        int[] numbers = {10,5,4,20,1,0};

        int max = numbers[0]; //maksimum noyu bulmak için başlangıçta ilk indeksin maksimum olduğunu kabul edebiliriz

       /* for (int i = 0; i < numbers.length; i++) {

        }
        // numbers.fori bu kısayolu kullanırsak kısayol olarak for loop oluşturur.indeks 0'dan Arrayın length ne kadarsa

        for (int i = numbers.length - 1; i >= 0; i--) {

        }
        //numbers.forr kısayolunu kullanırsak bu sefer tam tersi son indeksten 0'ıncı indekse kadar loop oluşturur
        */

        for (int i = 0; i < numbers.length; i++) {

            if(numbers[i] > max){ //if there is element in the array that is greater than the current maximum number
                max = numbers[i]; //asisgning greater number to variable max

            }
        }

        System.out.println(max);

    }



}
