package day35_Encapsulation.encapsulation;

public class Employee {

    private String name;
    private char gender;
    private int age;
    private double salary;

//    public String getName(){
//        return name;
//    }
//
//    public void setName(String name){
//        this.name = name;
//    }

    //peki 20 30 tane instance private variable olursa ne yapcaz intellij kısayol olarak sağ tıkla generate ve getter and setter seç sadece getter ya da sadece setter da seçebilirsin


    public Employee(String name, char gender, int age, double salary) {
        setName(name);  // this.name = name;
        setGender(gender);  // this.gender = gender;
        setAge(age);      //this.age = age;
        setSalary(salary);   // this.salary = salary;
    } //bu şekilde set metotlarını belirtirsek object oluşturulduğunda önceden belirlediğimiz koşullara göre set eder

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()){
            return;
        }

        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if( !(gender == 'M'|| gender == 'F')){
            return; // eğer bu koşul doğru olursa this.gender = gender; bu ifade execute edilmeyecek yani gender değeri set edilmeyecek
        }

        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 16 || age > 90){
            return;
        }

        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
       if(salary <= 0){
           return;
       }

        this.salary = salary;
    }



    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
/*
1. Create an Employee Class:
			private variables:
				name, gender, age, salary

			Encapsulate all the private fields

				1. Name can not be empty
				2. gender can not anything other than female or male
				3. age can not be less than 16, and greater than 90
				4. salary can not be zero or negative
 */