package day36_Inheritance.animalTask;

public class Dog extends Animal { //Animal parent classında oluşturduğumuz bütün variable ve metotları tekrar tekrar farklı classlarda oluşturmak yerine extends metoduyla Animal classından inherit yapmış oluruz. import olayında Animal classını import etsek bile classda olan variable ve metotları sadece ödünç almış oluruz ama extends keywordu ile classda olan bütün variable ve metotlara sahip olmuş oluruz(inheritance = the fastest way to get rich)
//Dog is an Animal(is relationship)
    //child(subclass) extends parent class(super class)
    //dog classı animal classından inherit yapmasına rağmen burada gözükmez
    //inheritance bir dezavantajı eğer parent classa bişey eklersen(metot ya da variable) oluşturulan child classların hepsi o eklenen özelliği de inherit etmiş olur yani ana classda ne varsa hepsi inherit edilmek zorundadır seçme şansı yoktur

    public void bark(){
        System.out.println(name + " is barking"); //inherit edildiği için bu ifadede bulunan name variable Dog classına aittir.Animal classına ait değildir
    }

}
