package day42_Exceptions;

class FadyException extends RuntimeException{
    //custom bir exception oluşturmak istersek RuntimeException classından inherit etmemiz gerekir çünkü RuntimeException classı tüm unchecked exceptionslar için parent classdır

    public FadyException(String message){
      super(message);
       // System.out.println("It is time for break"); eğer bu ifadenin exception mesajı olarak yazılmasını istersem parent class constructorını çağırmam lazım bu şekilde normal bir ifade olarak yazılır
    }
} //custom unchecked exception

class NoBreakException extends Exception{ // Exception classından inherit edersek checked exception oluşturabiliriz custom checked exception

}

public class CustomExceptions {

    public static void main(String[] args) {

      //  throw new FadyException("It is time for short break");

        try {
            throw new NoBreakException();
        } catch (NoBreakException e) {
            e.printStackTrace();
        }
    }
}
