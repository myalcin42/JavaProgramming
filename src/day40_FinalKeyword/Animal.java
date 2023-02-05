package day40_FinalKeyword;

public class Animal {

    private String name;
    private final String breed;
    private final char gender;
    private final String color;
    private String size;
    private int age;

    public Animal(String name, String breed, char gender, String color, String size, int age) { //final variables için koşul oluşturman gerekirse setter içerisinde yapamayacağın için contructor içersinde yapmak zorundasın
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.color = color;
        this.size = size;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public int getAge() {
        return age;
    }

    //------------------------------Setters--------------------------
    //setter metodu sadece final olmayan variables için generate edilir

    public void setBreed(String breed){
       // this.breed = breed;  eğer final için kendim setter oluşturmak istersem bu ifade hata verir çünkü obje oluşturduğum anda constructor hemen execute edilir ve breed variable set edilir bu yüzden tekrar setter metoduyla modifiye edemezsin
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //-----------------------Methods--------------------

    public void eat(){
        System.out.println(name + " is eating");
    }

    public final void drink(){ // final metotlar overrride yapılamaz
        System.out.println(name + " is drinking water");
    }


}
