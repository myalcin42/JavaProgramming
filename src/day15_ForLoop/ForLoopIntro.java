package day15_ForLoop;

public class ForLoopIntro {
    public static void main(String[] args) {

        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        //Bu şekilde 10 kere bu ifadeyi yazdırabilirim ama loop kullanırsam
        //bu işlemi tek bir ifade ile yapabilirim.Loop bu işe yarar for loop ise
        //eğer tekrarlanma sayısından %100 eminsem kullanılır

        System.out.println("------------------------------------");

        for (int i = 1 ; i <= 10 ; i +=1 ) {
            //initialization ; condition(bu iki öge mandatory) ;
            //loop condition false olduğu zaman durur. Sadece initialization ; condition
            //olduğu zaman i = 1 atadığımız için ve bu ifade her zaman 10'dan küçük
            //olacağı için bu şekilde sonsuza kadar bu ifadeyi yazdırır.O yüzden en son
            //öge olan "iteration" ifadesini eklemek gerekir ki loop koşul false olduğu
            //zaman kendini bitirsin.iterator olmadan oluşturulan loop hata vermez ama
            //infinite loop olur ve mantıksal olarak yanlıştır.Bu yüzden i +=1 bu ifadeyi
            //iterator olarak ekledik. Burada ++i ya da i++ yani pre ya da post increment
            //olmasının farkı yoktur
            System.out.println("Hello World");
            //Bu loop kullanımından dolayı bu ifade konsolda 10 kere yazdırılır
        }




    }

}
