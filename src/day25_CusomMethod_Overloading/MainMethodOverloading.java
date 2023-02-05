package day25_CusomMethod_Overloading;

public class MainMethodOverloading {

    public static void main(String[] args) {
        System.out.println("String");//any method can be overloaded including main method.But even if you overload main method,compiler will execute the building main method which is this main method.Ama bu işlemin herhangi bir faydası yoktur.Sadece bilgi amaçlı

    }

    public static void main(int[] args) { //main metodu overload etmek için parametreleri değiştirmke gerekmektedir
        System.out.println("int");
    }

    public static void main(double[] args) {
        System.out.println("double");
    }

    public static void main(char[] args) {
        System.out.println("char");
    }

}
