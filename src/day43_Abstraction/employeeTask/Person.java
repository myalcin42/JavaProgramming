package day43_Abstraction.employeeTask;

public abstract class Person {

    private String name;
    private int age;
    private char gender;


    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age <= 0){
            throw new RuntimeException("Invalid age: " + age);
        }

        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public abstract void sleep();

    public void eat(){ //herhangi bir metodun bütün objeler için aynı implementation sahip olacağını düşünürsen o metot regular metot olur ama şüphen varsa metot abstract yapmak daha mantıklıdır abstract metot sadece abstract class içerisinde olur ama abstract class objeye sahip olamaz
        System.out.println(name + " is eating baklava");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
