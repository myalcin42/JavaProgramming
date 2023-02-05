package day49_Collections;

import java.util.*;

public class QueuePractice {

    public static void main(String[] args) {

        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println("priorityQueue = " + priorityQueue); //priorityQueue = [10, 40, 300, 200, 90] the order is random

        Queue<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println("arrayDeque = " + arrayDeque); //arrayDeque = [10, 200, 300, 40, 90] keeps the insertion order

        Queue<Integer> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println("linkedList = " + linkedList); //linkedList = [10, 200, 300, 40, 90] keeps the insertion order

        System.out.println("=========     ==========     ==========");

        priorityQueue.poll();

        System.out.println("priorityQueue = " + priorityQueue); //priorityQueue = [40, 90, 300, 200] Queue'de fifo yani ilk giren ilk çıkar yönbtemi vardır bu yüzden poll metidu her çağrıldığında ilk elementi remove eder

        System.out.println("priorityQueue = " + priorityQueue);

        arrayDeque.poll();

        System.out.println("arrayDeque = " + arrayDeque);

        linkedList.poll();

        System.out.println("linkedList = " + linkedList);

        // System.out.println(priorityQueue.get(1)); indeks numarası yoktur
        //  System.out.println(arrayDeque.get(1));

        //   System.out.println( ( (List)linkedList ).get(1) ); burada linkedList objesinin reference type Queue olduğu için ve polymorphism kuralına göre reference type hangi metodun erişilebilir olduğuna karar verdiği için ve Queue içersinde get metodu olmadığı için downcasting yapabiliriz  ( (List)linkedList ( ya da  (List)linkedList şeklinde olabilir

        System.out.println(((LinkedList)linkedList).get(1));

    }
}
