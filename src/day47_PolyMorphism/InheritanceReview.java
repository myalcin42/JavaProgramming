package day47_PolyMorphism;

public class InheritanceReview {

    int a;

    public InheritanceReview(int a){
        System.out.println("parent class constructor");
    }
}

class A extends InheritanceReview{

    public A(int a) {
        super(a);
    }
}

class B extends InheritanceReview{

    public B(int a) {
        super(a);
    }
}

class C extends InheritanceReview{

    public C(int a) {
        super(a);
    }
}

class D{
    void m(){
        super.toString(); //super keywordu her classın parent classı olan Object classından metot çağırabilir D classı extends etmese bile
    }
}
