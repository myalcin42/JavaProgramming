package day30_CustomClass;

//Custom Classes main metota sahip değildir.We dont use them for running just for creating objects!!!!!!!!***************
public class Dog {

    public String name; // instance variable (when I create for example ten different objects from the Dog class it means that 10 separate copies of this variable created and each of the object has separate copies.instance variable olarak tanımlamazsak 10 farklı data değerini depolayamayız
    //instance variables are declared inside the class and outside of the any other methods yani bir variable içerisinde farklı objelere ait farklı verileri depolamak istersek bu instance variable olur.Mesela 10 farklı köpeğe ait isim,yaş gibi attributeler.
    public String breed;
    public int age;
    public char gender;
    public String size;
    public String color;
    //instance means: each object they can have separate copy

    //bütün köpekler için bilgileri teker teker girmek yerine bu şekilde metot oluştururuz
    public void setInfo(String dogName, String dogBreed, int dogAge, char dogGender, String dogSize, String dogColor ){
        name = dogName;
        breed = dogBreed;
        age = dogAge;
        gender = dogGender;
        size = dogSize;
        color = dogColor;
    }


    //oluşturulan bütün köpek objeleri için geçerli birer kopya metodu oluşturmamız gerektiği için static kelimesini metotta kullanamayız. static sadece tek bir kopya oluşturur
    public void eat(){ //bu eat metodunu hangi köpek objesi için çağırırsak sadece onu kastetmiş oluruz
        System.out.println(name + " is eating");
    }

    public void bark(){
        System.out.println(name + " is barking");
    }

    public String toString() { // kısayol : sağ tıkla Generate tıkla toString seç, Attributes leri seç ve Ok tıkla
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
/*
Bu bir custom class ve bu class objeleri içerecek ve herbir objenin ortak özellikleri Attributes olarak belirlenir
Attributes: (instance variables : her bir obje için attributes farklı olacak ve farklı değerler depolanacak bu yüzden instance variable olur(yani separate copies)
name, age, gender, breed, size, color
ve bu objelerin yapması gerekn fonksiyonlar instance method olarak belirlenir
Actions:
    eat(), play(), bark().....
 */