package homeWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 5 numbers");

        for (int i = 0; i < 5; i++) {
            int temp = scan.nextInt();

            if(!numbers.contains(temp)){
                numbers.add(temp);
            }
        }

        Collections.sort(numbers);
        System.out.println(numbers);


    }


}
// get 5 numbers from the user. and add them into the arraylist in a unique sorted way
// 1 1 3 3 5            1 3 5