package day44_Abstraction.animalTask;

public interface Playable { //abstract classdan inherit yaptığında subclasslar abstract classda olan bütün metotları ve variableları aynen olduğu gibi alır seçme şansı yoktur. ama mesela bazı hayvanlar evcil değildir eğer evcil olma özelliğini abstract classa eklersek bütün subclasslar (yani bütün hayvanlar) evcil olmadığı halde evcillik özelliğini inherit etmek zorundadır işte bütün hayvanlar için common olmayan ama bazıları için common olan özellikler için interface oluşturulur.interface class değildir, intellij de class oluşturur gibi yapılır ve interface seçilir eğer yanlışlıkla class oluşturursak classı siler interface yazarız.interface class değildir ama inherit edilecek özellikler barındırdığı için "supertype" olarak adlandırılır

    //static boolean isFriendly; //bu şekilde yazıldığında hata verir çünkü default olarak interface içerisinde bulunan variablelar static ve finaldır ve hemen initialize edilmesi gerekir ama static blok ya da başka bir blok interface de kullanılamaz
    static boolean isFriendly = true;  //static de gri renkte gözüküyor çünkü interface de bütün variablelar default olarak static ve finaldır yazılmasa da olur
    /*
    public static void method1(){
        System.out.println(isFriendly); //static blok interface de olmaz ama static metot olabilir.isFriendly variableın static olduğunun kanıtı: static metotlar sadece static variable kabul eder
    }
    */
    //interface için :bütün variablelar default olarak static ve finaldır. ve default access modifier değeri public dir.metotlar default olarak abstractdır. interface class olmadığı için obje de oluşturulamaz.
    void play();  //abstract by default

}
