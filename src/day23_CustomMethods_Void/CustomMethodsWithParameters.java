package day23_CustomMethods_Void;

public class CustomMethodsWithParameters {

    public static void main(String[] args) {
        oddOrEven(10); //method demands additional info to complete its task yani parantez içerisine bir veri girmezsen hata verir, oluşturduğun metotun parantez içerisinde belirttiğin data tipi neyse burada da parantez içerisine onu gireceksin burada parantez içerisine 10 yazdığımız için metotta belirttiğimiz çift ya da tek sayı koşulu konsolda gözükecek 10 rakamıçift olduğu için çift olacak

        ageOfPerson(1995);

        printNumbers(10, 15);
    }

    //create a function that can check if a number is odd or even number
    public static void oddOrEven(int number){ // burada işlemi gerçekleştirmek için ekstra bilgi olarak sayının ne olduğunu bilmemiz gerekmektedir bu yüzden bir parametreye ihtiyacımız vardır(parantez içerisine yazılır)
        if(number % 2 == 0){
            System.out.println(number + " is even number");
        }else{
            System.out.println(number + " is odd number");
        }

    }

    //create a function that can display the age of the person
    public static void ageOfPerson(int birthYear){
        int age = 2022 - birthYear;
        System.out.println("Your age is: " + age);
    }

    //create a function that can print all the numbers between X and Y
    public static void printNumbers(int x, int y){
        for (int i = x; i <= y; i++) {
            System.out.print(i + " ");
        }
    }



}
