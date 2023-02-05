package day32_Constructor;

public class ConstructorCalls {

    //      1. Constructor can not be called by its name ( this() need to be used )
    //		2. Only a constructor can call another constructor
    //		3. Constructor call MUST be at the first step
    //		4. One constructor can not call more than one constructor
    //		5. Constructor can not call or contain itself
    public ConstructorCalls(){
        //this(); bu şekilde bir constructor içerisinde constructorın kendisini çağıramayız
        //5. Constructor can not call or conatin itself
        System.out.println("Default Constructor");
    }

    public ConstructorCalls(int age){
        //ConstructorCalls(); bu şekilde de olmaz çünkü 1. Constructor can not be called by its name ( this() need to be used )
        this();
        System.out.println("Constructor with int argument");
        //this(); bu şekilde hata verir çünkü 3. Constructor call MUST be at the first step
    }

    public ConstructorCalls(String str){
        this(5);
        //this(10); bu şekilde de hata verir çünkü 4. One constructor can not call more than one constructor
        System.out.println("Constructor with String argument");
    }

    public static void main(String[] args) {
        ConstructorCalls obj1 = new ConstructorCalls();
        // Default Constructor
        System.out.println("======================================");

        ConstructorCalls obj2 = new ConstructorCalls(10);
        //Default Constructor
        //Constructor with int argument
        System.out.println("==========================================");

        ConstructorCalls obj3 = new ConstructorCalls("Java");
        //Default Constructor
        //Constructor with int argument
        //Constructor with String argument
    }

}
