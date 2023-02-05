package day48_Collections;

import java.util.*;

public class ListIntro {

    public static void main(String[] args) {

       // List<Integer> list1 = new List<>(); list bir collection çeşididir ve interface olduğu için obje oluşturulamaz bu yüzden bu ifade hata verir

        List<Integer> list1 = new ArrayList<>(); //bu ifade bir polymorphis'dir Arraylist dışında LinkedList, Vector ve Stack List interfaceni extends etmişlerdir
        list1.addAll(Arrays.asList(10,20,30,40,50,60));

        System.out.println(list1.get(0)); //while accessing the element ArrayList is faster among the others

        List<Integer> list2 = new LinkedList<>();
        list2.addAll(Arrays.asList(10,20,30,40,50,60)); //while inserting or deleting an element LinkedList is faster among the others

        System.out.println(list2.get(0));

        List<Integer> list3 = new Vector<>();
        list3.addAll(Arrays.asList(10,20,30,40,50,60));

        System.out.println(list3.get(0));

        List<Integer> list4 = new Stack<>();
        list4.addAll(Arrays.asList(10,20,30,40,50,60));

        System.out.println(list4.get(0));

        System.out.println("================================================");

        System.out.println(list4); // [10, 20, 30, 40, 50, 60] Stack classı da Vector classını inherit ettiği için aynı özelliklere sahiptir ama LIFO yöntemiyke çalışır yani sondaki element ilk çıkar

        ((Stack)list4).pop();  //List<Integer> list4 = new Stack<>(); olduğu için downcasting yapmamız lazım

        System.out.println(list4);  //[10, 20, 30, 40, 50] pop metodu ile sondaki element silinir

        

    }

    public synchronized void method1(){ //thread-safe
        //synchronized keywordu threadler arasında senkronizasyonu sağlamak için kullanılır ve Vector classı metotları bu şekilde oluşturulur her applikasyon execute edilirken farklı threadler oluşturur ve bu threadler birbiriyle senkronize çaışmazsa sıkıntı olabilir Vector classı threadler arasında sırayla çalışmayı sağlar
    }
}
