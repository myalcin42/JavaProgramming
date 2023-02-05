package day17_While_DoWHile;

public class BranchingStatements2 {

    public static void main(String[] args) {

        for(char i = 'A'; i <= 'E' ; i++){

            if(i == 'C'){
                continue; // bu ifade koşulu sağlayan durumu atlar ve sonrakine geçer yani burada A ve B yi yazdırır C yi atlar ve D ye geçer
            }
            System.out.println(i);
        }

            System.out.println("--------------------------------------");

            //print all even number 1 - 10 (skip the odd numbers)

        for (int i = 1; i <= 10 ; i++) {
            if(i % 2 != 0 ){
                continue;
            }
            System.out.println(i);
        }

        System.out.println("----------------------------------------");
        //print all odd numbers between 1 - 10 (skip the even numbers)

        for (int i = 1; i < 10; i++) {
            if(i % 2 == 0){
                continue;
            }
            System.out.println(i);
        }
    }

}
