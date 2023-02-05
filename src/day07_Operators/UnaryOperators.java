package day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {

        int num1 = +25; //+ operator makes the data positive number
                        // but it is already taken as positive by the
                        //compiler.No need to add it
        int num2 = -25; //you must use this -(negative) operator
                        //if you want to make the number negative

        System.out.println(num1 < 0); //false
        System.out.println(num2 < 0); //true

        System.out.println("================================================");
        //Pre increment and decrement (işlem hemen gerçekleşir immediately)
        int a = 5;
        ++a;      //if you apply the  ++ operator before the variable name it is pre increment
                  // pre increment : increases the value by 1 right away
        System.out.println(a); //a nın değeri 1 arttığı için 6 olur

        --a; //if you apply the -- operator before the variable name it is pre decrement
                // pre decrement : decreases the value by 1 right away
        System.out.println(a); //a nın değeri 1 azaldığı için 5 olur


        //Post Increment and Decrement (işlem hemen gerçekleşmez)
        System.out.println("===============================================");

        int b = 100;
        System.out.println(++b); //pre increment değeri anında 1 fazla arttırır
                                // yukarıdaki gibi yazmasak bile


        int c = 100;
        System.out.println(c++); //post increment:first passes the current value
                                // then increases the value by 1 (two step process)
        System.out.println(c); //post farkı bu bir sonraki adımda yapar artışı(101)


        System.out.println("=============================================");


        int x = 200;
        System.out.println(--x); //pre decrement:decreases the value by 1 right away(199)

        int y = 200;
        System.out.println(y--); //post decrement:first passes the current value
                                // then decreases the value by 1 (200 olur çıktı)

        System.out.println(y); //199 olur çıktı

        System.out.println("=================================================");

        int z = 45;

        System.out.println(++z); //46 olur hemen bu satırda (pre increment)
        System.out.println(z++); //46 olarak kalmaya devam eder bu satırda (post increment)
                                // bu satırdan sonra z' yi kullanırsan 47 olur
        System.out.println(z); //47 olur


        int q = 30;

        System.out.println(--q); // 29 pre decrementation
        System.out.println(q--); // 29 olur post decrementation
                                // bu satırdan sonra q kullanıldığında 28 değerini alır
        System.out.println(q); //28




    }


}
