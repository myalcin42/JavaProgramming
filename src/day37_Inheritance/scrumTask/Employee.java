package day37_Inheritance.scrumTask;

public class Employee extends Person{ // Employee IS A Person (IS A relation konsepti)

    public String jobTitle;
    public int id;
    public double salary;
    public String companyName;

    public Employee(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) { // bu employee classında classa özel instancelar olduğu için onları da constructor da tanomlamak gerekir bu yüzden yine kısayolu kullanarak constructor oluşturulur ve parent classdan inherit edilen instrancelar için super keyword ifadesi başlangıça otomatik olarak eklenir
        super(name, age, gender);
        this.jobTitle = jobTitle;
        this.id = id;
        this.salary = salary;
        this.companyName = companyName;
    }

    public void word(){
        System.out.println(jobTitle + " " + name + " is working");
    }

    public String toString() { //bu classda bulunan instanceları yazdırabilmek için toString metodunu bu class içerisinde de oluşturabiliriz ama aslında şu an itibariyle sadece tek bir toString metodu oluşmuştur ve o da parent classdadır şu an sadece o metodu different implementation yaptık(overriding deniliyor bu işleme ayrıntısını sonra görcez)
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +

                '}';
    }
}
