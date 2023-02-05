package day18_NestedLoop;

public class NestedLoopIntro {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        } //bu döngüyü 4 defa tekrarlamak istersek bu loop içerisinde başka bir loop kullanırız

        System.out.println("--------------------------------------------------");

        for (int j = 0; j < 4; j++) { //when the outer loop executed one time the inner loop gets executed 5 times (for this example).Bir loop tekrarlanması gerektiğinde nested loop kullanılır(loop inside another loop)
            //one iteration of the outer loop, executes all the iterations of the inner loop

                for (int i = 0; i < 5; i++) {
                System.out.println("Wooden Spoon");
            }
        }




    }



}
