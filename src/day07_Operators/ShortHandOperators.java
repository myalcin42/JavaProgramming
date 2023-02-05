package day07_Operators;

public class ShortHandOperators {

    public static void main(String[] args) {

        //assignment operator: = bu işaret normalde eşittir anlamındadır
        //ama javada assignment anlamına gelir
        int number = 100;

        System.out.println("number = " + number); //100

        number = 200; //11.satırdan sonra number değişkenine yeni bir değer atadık
                        // = assigment operator ile

        System.out.println("number = " + number); //200

        String word = "Java Programming";

        System.out.println("word = " + word); //"Java Programming"

        word = "Wooden Spoon";

        System.out.println("word = " + word); //Wooden Spoon

        word = "Cydeo"; //reassigning using the = assigning operator

        System.out.println("word = " + word); //Cydeo

        System.out.println("===================================================");

        //Addition Assignment :
            int x = 100;
        System.out.println("x = " + x); //output 100 olur

        // x = x + 200; (Bu işlemin kısa yolu aşağıda)
        // System.out.println("x = " + x); //300 olur
        x += 200; //önce 200 ile topla sonra yeni değeri x'e assign et (+=)
        System.out.println("x = " + x); //300 olur

        String str = "Wooden";
        str += " Spoon"; //sadece rakamlarda değil String olarak da olur
        System.out.println("str = " + str); //Wooden Spoon olur

        double num1 = 2.5;
        System.out.println("num1 = " + num1); //2.5 olur

        num1 += 5.5;

        System.out.println("num1 = " + num1); //8.0 olur ve yeni değer 8 olarak atanır

        double availableBalance = 1000.50;

        //deposit 300$
        availableBalance += 300; //availableBalance = 1000.50 + 300

        System.out.println("availableBalance = " + availableBalance);

        System.out.println("=================================================");

        // withdrawing 500$ from the account
        //Subtraction Assignment
        //Shorthand operators dan sadece += String için kullanılabilir
        //Diğerleri String için kullanılamaz
        availableBalance -= 500;

        System.out.println("availableBalance = " + availableBalance);

        //withdrawing 200$, then depositing 400$

        availableBalance -=200; //available balance=600.5
        availableBalance +=400; //available balance=1000.5

        System.out.println("availableBalance = " + availableBalance);

        System.out.println("===================================================");
        //Multiplication Assignment

        double salary = 50000.50;
        salary *= 2; // salary = salary * 2 ile aynı şey sadece kısayol

        System.out.println("salary = " + salary);

        double dogecoin = 0.00000001;
        dogecoin *= 1000000;
        System.out.println("dodge = " + dogecoin);

        System.out.println("==========================================");
        //Division Assignment
        double num2 = 25000.0;
        //Reduce the number by half
        num2 /= 2; // num2 = num2 / 2 ile aynı

        System.out.println("num2 = " + num2);

        System.out.println("=================================================");

        //Remainder Assignment

        double num3 = 100;
        num3 %= 3;

        System.out.println("num3 = " + num3);

        System.out.println("==========================================");

        int amount = 127; // cents

        int quarters = amount / 25;
        int cents = amount % 25;

        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);

        System.out.println("================================");
        int cents2 = 127;
        cents2 %= 25;

        System.out.println("cents2 = " + cents2);

        System.out.println("===================================");

        int y = 300;
        y %= 16;  // y = y % 16; ile aynı

        System.out.println("y = " + y);

        System.out.println("========================================");

        int balance = 3500;
        // insurance fee : $153
        balance %= 153;
        System.out.println("balance = " + balance);










    }


}
