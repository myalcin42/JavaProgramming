package day37_Inheritance;

class A{

    public A(int a){ //constructor içerisinde parametre tanımladığımız zaman eğer child classda constructor çağırmazsak compiler hata verir
        System.out.println("A");

    }
}

class B extends A{

    public B(){
        //super() parent class constructor default olduğu için compiler implicitly bir şekilde bu işlemi yapar fakat if the parent class has a constructor with argument the child class must call this constructor explicitly by using the super keyword this keyword sadece geçerli classın constructorını çağırmak için kullanılır ama parent class constructorını çağırmak içib super keyword kullanmak zorunludur
        super(9);
        System.out.println("B");
    }

}

public class ConstructorPractice {

    public static void main(String[] args) {

        B obj = new B();  // A B
    }
}
