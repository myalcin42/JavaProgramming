package day53_FunctionalInterface;

@FunctionalInterface
public interface MyThirdFunctionalInterface<T> {

    T method(T data); //by default public and abstract

}

/*
2. Create a Functional interface named MyThirdFunctionalInterface that has an abstract method takes one argument of any type and returns the same type
 */