package day24_CustomMethod_Return;

public class ReturnMethodPractice {

    public static void main(String[] args) {
        //find the max number 100 & 200
        int maxNumber = max(100,200);

        System.out.println(maxNumber);

        //multiply the max number by 2

        int multiplication = maxNumber * 2;
    }

    public static int max(int a, int b){
        int result = 0;

        if(a > b){
            result = a;
        }else{
            result = b;
        }
        return result; // return is also a branching statement, it is used for exiting the current method, also it is used to return a value from the method.Ama metot void bile olsa return kullanabilirsin metottan çıkmak için.  ama  bu şekilde herhangi bir değer döndüremezsin
    }

}
