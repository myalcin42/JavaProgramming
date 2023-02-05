package day34_GarbageCollection_AccessModifiers;

public class Constructor_vs_StaticBlock {

    static{
        System.out.println("Static Block");
    }

    public Constructor_vs_StaticBlock(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Main Method");

        new Constructor_vs_StaticBlock(); // oluşturulan her bir obje için constructor ayrı ayrı execute edilmesine rağmen static sadece bir defa execute edilir
        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();
    }

    //ilk önce static blok sonra main metot execute edilir ama constructor execute edilmez çünkü consturctorın execute edilmesi objeye bağlıdır classa değil
}
