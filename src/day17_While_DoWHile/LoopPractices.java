package day17_While_DoWHile;

public class LoopPractices {

    public static void main(String[] args) {

        for(int i = 1 ; i <= 10 ; i++){
            System.out.println(i);
        }

        System.out.println("-------------------------------------------");
        //Aynı soruyu while ile yaparsak
        int j = 1; //initialization ifadesi while() parantez içerisinde olmadığı için döngünün dışında vermek zorundayız while içerisinde sadece boolean data tipinde koşul ifadesi verilir
        while(j <= 10){
            System.out.println(j);
            j++;
        }
        //Yani yukarıdaki soru while loopla da yapılıyor olsa bile tekrarlanma sayısını kesin olarak bildiğimiz için for loop daha iyi bir çözümdür

        System.out.println("---------------------------------------");
        int k = 1;
        do{
            System.out.println(k);
            k++;
        }while(k <= 10);
        //Görüldüğü gibi do while ile yapmak da mümkündür aynı soruyu ama biraz daha zor ve etkin değildir
    }



}
