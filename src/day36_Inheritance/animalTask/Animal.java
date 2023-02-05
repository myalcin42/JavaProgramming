package day36_Inheritance.animalTask;

public class Animal { // inheritance konsepti genel olarak ortak özelliklere sahip classlar için her defasında aynı attributesleri ayrı ayrı oluşturmak yerine  bir parent class oluşturup ortak özellikleri orada oluşturmak ve sub ya child class olarak oluşturduğumuz classlara ırtak özellikleri inherit etmek

    //burada Animal bir parent class( yani class that contains the common features meant to be inherited) ve ilk önce parent(super) class oluşturulur
    //inheritance anlamak için şimdilik encapsulation ve diğer konseptleri unut!!!
    //bütün hayvanlarda ortak olan özellikler
    public String name, breed;
    public char gender;
    public int age;
    public String size;
    public String color;

    //konuyu daha anlamak için şimdilik constructor öncesi gibi setInfo kullanacaz çünkü constructor konsepti inheritance konusunda biraz farklı
    public void setInfo(String name, String breed, char gender, int age, String size, String color) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.size = size;
        this.color = color;
    }

    public void eat(){
        System.out.println(name + " is eating");
    }

    public void drink(){
        System.out.println(name + " is drinking");
    }

    public void move(){
        System.out.println(name + " is moving");
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }


    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    //oluşturduğumuz bu metot ve variableları parent classda oluşturduğumuz için child classlarda oluşturmaya gerek olmayacak çünkü buradan inherit edilecek
}
