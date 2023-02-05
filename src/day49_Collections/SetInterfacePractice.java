package day49_Collections;

import java.util.*;

public class SetInterfacePractice {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,200,300,40,90)); //list de bir interfacedir ama duplicate elementlere izin verir yani şu an List'in size() = 25 dir ve List girdiğin sırayla elementi sıralar ve indeks numarası vardır
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println(list);
        System.out.println(list.get(4)); //List de bu şekilde indekse ulaşabiliriz


        Set<Integer> hashSet = new HashSet<>(); //fastest performance
        hashSet.addAll(Arrays.asList(10,200,300,40,90)); //Set bir interfacedir yani obje oluşturulamaz ve duplicate elementlere izin vermez ve element sırası rastgele olur yani ilk girdiğin element ilk sırada olmayabilir ama LinkedHashSet'de sıralama girdiğin veri sırasına göredir. Set'de indeks numarası yoktur
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(null, null, null)); //sadece tek bir null ifadeyi kabul eder duplicate olanları kabul etmez

        System.out.println(hashSet); //[200, 40, 10, 90, 300] random order
       // System.out.println(hashSet.get(4)); Set interfaceinde bu şekilde indekse ulaşamayız. HashSet elementleri rastgele sıraya koyar aşağıdaki LinkedHashSet ise girdiğin sıraya göre elementleri sıralar


        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(Arrays.asList(10,200,300,40,90));
        linkedHashSet.addAll(Arrays.asList(10,200,300,40,90));
        linkedHashSet.addAll(Arrays.asList(10,200,300,40,90));
        linkedHashSet.addAll(Arrays.asList(10,200,300,40,90));
        linkedHashSet.addAll(Arrays.asList(null, null, null));

        System.out.println("linkedHashSet = " + linkedHashSet); //linkedHashSet = [10, 200, 300, 40, 90, null] does not accept duplicates ve sırayı değiştirmez
        

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
     //   treeSet.addAll(Arrays.asList(null, null, null));

        System.out.println("treeSet = " + treeSet); //treeSet = [10, 40, 90, 200, 300] treeSet bu şekilde elementleri sort eder yani küçükten büyüğe sıralar ve LinkedHastSet ve HasSet'e göre daha yavaştır ve aynı zamanda null değeri kabul etmez null değer eklemek istersen NullPointerException verir




    }

}
