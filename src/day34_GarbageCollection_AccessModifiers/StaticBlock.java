package day34_GarbageCollection_AccessModifiers;

public class StaticBlock {

    public static void main(String[] args) {

        System.out.println("Main method");
    }

    static{ // java 8 den önce class içerisinde kodu çalıştırmak için main metota gerek yoktu ama jdk 8 den sonra bu değişti main metot kodu çalıştırmak için mecburi oldu ama eğer class içerisinde statik blok varsa main metot olsa bile ilk önce bu blok çalıştırılır. statik bloğun özelliği

        System.out.println("Static Block");

        //Static Block konsolda önce statik blok sonra main metot çalıştırıldı
        //Main method
        // runs first before anything and only runs one time
        //birden fazla statik blok oluşturulabilir ama Muhtar buna gerek olmayacağını söyledi
        // statik blok sadece bir defa run edildiği için genelde statik memberların initialize edilmesi maksadıyla kullanılır
    }

}
