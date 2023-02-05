package day09_IfStatements;

public class LeapYear {
    public static void main(String[] args) {

        int year = 2000;
        boolean leapYear = year % 4 == 0;

        if (leapYear){
            System.out.println("Year " + year + " is leap year");
        }
        if(!leapYear){
            System.out.println("Year " + year + " is NOT a leap year");
        }
        // standart if statement kullanımı bu şekilde aynı görevi if else kullanarak da
        //yapabiliriz.
        System.out.println("------------------------------------------------");

        if(leapYear){
            System.out.println("Year " + year + " is leap year");
        } else{
            System.out.println("Year " + year + " is NOT a leap year");
        }
        //bu işlemi iki farklı bağımsız if değişkeniyle yaparsak compiler hepsini kontrol eder
        //ve bu ekstra bir işlemdir fakat if else kullanılırsa if koşulu sağladığında
        //compiler else blokuyla ilgilenmez bu yüzden sadece iki olasilık bulunan durumlarda
        //if else kullanmak daha mantıklıdır yani daha efficient bir yoldur





    }




}
