package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        System.out.println(list); // [100, 200, 200, 200, 300, 400, 500]
//        int num = 1;
//        list.remove(num); //bu şekilde indeks numarasına göre remove işlemi gerçekleşir.Diğer bir remove tipi Object değerine göre yapılır

        Integer num = 200;
        boolean r1 = list.remove(num); // burada 3 tane 200 olduğu için ilk element kaldırılır ve bu ifade boolean değeri döndürür.remove metodunu loopta kullanma dedi Muhtar!!????????????

        System.out.println(r1); //burada 200 non-primitive değeri Arraylist içerisinde olduğu için bu ifade true sonucunu verir

        //ama sadece
        // list.remove(200); //bu şekilde ifade edersek remove metodunun özelliğinden dolayı 200 değeri otomatik olarak primitive int(yani indeks numarası) olarak algılanır Arraylist içerisindeki 200 elementi olarak algılanmaz ve böyle bir indeks numarası olmadığı için outofboundsexception hatası verir
        System.out.println(list); // [100, 200, 200, 300, 400, 500]

        // clear() metodu: remove all the elements of the ArrayList, size will be 0
        System.out.println("==========================");

        System.out.println(list.size()); // şu anda 6

        list.clear();

        System.out.println(list.size()); // 0 oldu içerisinde hiçbir element kalmadı

        //indexOf(Data): returns the first matching element' index number,returns int
        //lastIndexOf(Data):  returns the last matching element' index number,returns int

        System.out.println("===================================");

        ArrayList<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');

        int a = characters.indexOf('A'); // 0
        int b = characters.lastIndexOf('A'); // 4

        System.out.println(a);
        System.out.println(b);

        System.out.println("============================");

        //contains() metodu

        boolean r2 = characters.contains('A');

        boolean r3 = characters.contains('Z');

        System.out.println("r2 = " + r2); // true
        System.out.println("r3 = " + r3); // false

        System.out.println("======================================");
        //equals(ArrayList) returns if two arraylists are equal(same elements are in the same order) otherwise returns false
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1 == list2); // false
        System.out.println(list1.equals(list2)); // true

        System.out.println("==========================================");
        //isEmpty() metodu Arraylist boşsa yani hiçbir element yoksa true döner
        boolean r4 = list1.isEmpty(); // false

        System.out.println("r4 = " + r4); // false

        list1.clear();
        boolean r5 = list1.isEmpty(); // true olur çünkü clear metodu ile size 0'a indirdik

        System.out.println("=========================================");
        //Bulk operation : Collection Type
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7));

        System.out.println(numbers); // [1, 2, 3, 4, 5, 6, 7]


    }


}
