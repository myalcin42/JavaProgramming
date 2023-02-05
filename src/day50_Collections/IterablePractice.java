package day50_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterablePractice {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        //remove all the elements that are less than 4

        for (int i = 0; i < list.size() ; i++) {
            if(list.get(i) < 4){
                list.remove(i); //bu şekilde yaparsak her iterasyonda bir element remove edildiğinde size flexible olduğu için indeks numarası değişecek ve bazı elementler koşula uysa bile remove edilmeyecek bu yüzden bu işlemi sağlıklı bir şekilde yapmak için Iterable interface i kullanılır java 8 den sonra gelen lambda expression ile bu mesele çözüldü ama o bile Iterable kullanır Iterator Iterable interfaceinden gelir
            }
        }

        System.out.println(list);

        System.out.println("========== ============= ========== ============");

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        //remove all the elements that are less than 4

        Iterator<Integer> it = list2.iterator();

       while(it.hasNext()){

           if(it.next() < 4){
               it.remove();
           }
       }

        System.out.println(list2); //[4, 5, 4, 5, 4, 5]

        System.out.println("============ ============== ==================");

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        for(Iterator<Integer> i= list3.iterator(); i.hasNext() ; ){
            if(i.next() < 4){
                i.remove();
            }
        }

        System.out.println(list3);

        System.out.println("==============  ==================  ====================");

        List<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        list4.removeIf( each -> each < 4); //java 8 den sonra Iterable interfaceine eklenen lambda expression sayesinde yukarıda karmaşık bir şekilde yaptığımız çözüm tek satırda halloldu removeIf metodu ile

        System.out.println(list4);


    }
}
