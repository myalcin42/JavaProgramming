package day41_Exceptions;

public class FinallyBlock {

    public static void main(String[] args) {

        int[] arr = {1,2,3};

        try{
            System.out.println(arr[10]);
            System.out.println("try block");
        }catch(RuntimeException e){
            System.out.println("catch block");
            e.printStackTrace();
            System.exit(0);
        }finally{ //finally blok exception handle edilse de edilmese de execute edilir backend testlerinde kullanılacakmış yani ne olursa olsun blokun execute edilmesi gerektiğinde finally bloku kullanılır.eğer finally blokun execute edilmesini engellemek istersen finally blokundan önce explicitly bir şekilde programı terminate etmen gerekir.System.exit ekledik bu yüzden
            System.out.println("finally block");
        }
    }
}
