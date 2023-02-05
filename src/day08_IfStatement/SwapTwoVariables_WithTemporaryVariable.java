package day08_IfStatement;

public class SwapTwoVariables_WithTemporaryVariable {

    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        int c = b; //c = 15 now
        b = a; //b will become a and 10
        a = c;

        System.out.println("a = " + a); // 15 oldu
        System.out.println("b = " + b); // 10 oldu
        //geçici bir variable kullanarak variable arasında swap yaptık

    }


}
