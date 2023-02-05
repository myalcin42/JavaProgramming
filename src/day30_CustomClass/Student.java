package day30_CustomClass;

public class Student {

    public String name;
    public char gender;
    public int age;
    public int ID;
    public char grade;


//    public void setInfo(String name, char gender, int age, int ID, char grade){
//        // name = name; //bu metotta parametrelere instance variable isimlerini atayabilirim çünkü bunlar local variable ve instance variable ile aynı isme sahip olabilirler fakat bu şekilde name = name; atama yapmak istersem, metot bloğu içerisinde olduğumuz için name yazıldığında metottaki local variable algılanır. Yani instance variable olan name algılanmaz, yani variable tekrar kendisine atanır bunu çözmek için this keywordu kullanılır
//
//        this.name = name; // this keyword is only used for calling the instance variable if it has the same name with the local variable
//        this.gender = gender;
//        this.age = age;
//        this.ID = ID;
//        this.grade = grade;
//    }
    // eğer setInfo kısayolunu kullanmak istersek : sağ tıkla generate sonra constructor ve hepsini seç ok tıkla.Açılınca setInfo olarak yazmıyor değiştir

    public void setInfo(String name, char gender, int age, int ID, char grade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.grade = grade;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", grade=" + grade +
                '}';
    }

    public void code(){
        System.out.println(name + " is coding");
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }
}
