package day35_Encapsulation.encapsulation;

public class Person {

    private String name; //in order to protect and make more secured we assign private access modifier to instances
    private int age;

    //peki diğer classlarda bu variable değerlerine ulaşmak istersek ne yaparız? private class dışında erişilebilir olmadığı için encapsulation konseptine göre getters ve setters metotlarını kullanırız. getters ve setters public olmak zorunda
    //Encapsulation sadece instance variable değerleri için geçerlidir

    public String getName(){ // bu getter metodu bize private name değerini döndürür eğer başka bir class içerisinde private instance variable değerini almak istersek bir getter kullanmak zorundayız yani bu metodu çağırmak zorundayız
        return name;
    }

    public void setName(String name){ // setter instance metodu ise private variable değeri üzerinde değişiklik yapmak istersek kullanılır
        this.name = name;
    }

    public int getAge(){ // read the variable through the getter
        return age;
    }

    public void setAge(int age){ // modify the variable through the setter
        if(age <= 0){
            System.err.println("Invalid age: " + age);
            System.exit(0);
        }

        if(age > 150){
            System.err.println("Invalid age: " + age);
            System.exit(0);
        }
        this.age = age;
    }
}
