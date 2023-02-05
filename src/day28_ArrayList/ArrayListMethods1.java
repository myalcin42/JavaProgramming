package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10); //Autoboxing (converts the 10(integer) in to the Integer wrapper class implicitly
        //add(Data): adds the data after the last index of the ArrayList
        //add(index,data): istenilen indekse data ekler
         numbers.add(20);
         numbers.add(30);
         numbers.add(40);
         numbers.add(50);
         numbers.add(60);
        System.out.println(numbers); // [10, 20, 30, 40, 50]
        numbers.add(2,25); //inserts an element to the specified index
        numbers.add(5,45);
        System.out.println(numbers); //[10, 20, 25, 30, 40,45,50, 60]
        //size() metodu:Arraylist deki element sayısını gösterir(returns the total number of elements
        System.out.println(numbers.size()); //8

        int lastIndex = numbers.size() - 1;
        System.out.println("lastIndex = " + lastIndex); // 7

        //get(index): returns the element at the given index
        int num = numbers.get(3);  //unboxing:  numbers.get(3) this statement returns an Integer object.ıf we convert it to a priminitve int data type it is unboxing

        System.out.println("num = " + num); //30

        System.out.println("======================================");

        for (int i = 0; i < numbers.size(); i++) { //Arraylist elementlerine ulaşmak için
            System.out.println(numbers.get(i));
        }

        System.out.println("=====================================");

        //set(index, Data) metodu: replaces the element at the given index with the new element.It does not change the size of the ArrayList, just replaces the element

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");

        System.out.println(list); // [Java, Python, Java, C#, Ruby]

        list.set(2,"JavaScript");

        System.out.println(list); //[Java, Python, JavaScript, C#, Ruby]

        list.set(3, "C++");

        System.out.println(list); // [Java, Python, JavaScript, C++, Ruby]

        System.out.println("=========================================");

        //remove(int index) metodu : removes the element at the given index

        ArrayList<String> employees = new ArrayList<>();

        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("Ali");
        employees.add("Hulya");
        employees.add("Kaloyan");

        System.out.println(employees); //[Suat, Aygun, Olga, Neira, Ali, Hulya, Kaloyan]

        //if I want to remove the first name from the Arraylist
        employees.remove(0); //ilk indeksteki element kaldırdı

        System.out.println(employees); //[Aygun, Olga, Neira, Ali, Hulya, Kaloyan]

        employees.remove(0); // ilk indeksteki elementi kaldırdı diğer elementler sola doğru kaydı

        System.out.println(employees); //[Olga, Neira, Ali, Hulya, Kaloyan]

        employees.remove(1);

        System.out.println(employees); //[Olga, Ali, Hulya, Kaloyan]

        employees.remove(employees.size() - 1);

        System.out.println(employees); // [Olga, Ali, Hulya]

        //remove(Object) : removes the given object from Arraylist.removes the first one
        boolean r1 = employees.remove("Hulya"); //remove 2.şekli

        System.out.println(employees); // [Olga, Ali]

        boolean r2 = employees.remove("Ali");

        System.out.println(employees); // [Olga]

        System.out.println("r1 = " + r1); // true
        System.out.println("r2 = " + r2); // true

    }

}
