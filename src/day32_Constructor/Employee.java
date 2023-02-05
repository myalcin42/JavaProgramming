package day32_Constructor;

public class Employee {
    //eğer bir custom class içerisinde birden fazla constructor oluşturmak istersek constructorın ismi class ismi ile aynı olması gerektiği için overloading yaparak bu işlemi gerçekleştirebiliiriz birden fazla constructor bize object oluştururken bir birden fazla seçenek sunar
    //Constructor call rules
    //1. Constructor can not be called by its name ( this() need to be used )
    //2. Only a constructor can call another constructor
    //3. Constructor call MUST be at the first step
    //4. One constructor can not call more than one constructor
    //5. Constructor can not call or contain itself
    public String name;
    public char gender;
    public String jobTitle;
    public double salary;

    public Employee(String name){
        this.name = name;
    }

    public Employee(String name, char gender){ //burada constructor overloading işlemi yapıyoruz içerisinde ki parametreleri değiştirerek object oluştururken daha fazla opsiyon elde etmiş oluyoruz
        //Employee(name);        //this.name = name; bu ifadeyi önceki metotta da belirtmiştik o yüzden burada tekrar kullanmaya gerek yok bu yüzden önceki konularda olduğu gibi tekrar kullanmamak için metodu çağırabiliriz ama constructor metodu biraz farklı olduğu için sadece Employee(name); constructor ismini yazarak metodu çağıramayız o yüzden aşağıdaki gibi yaparız
        // this(name); // bu şekilde önceki constructor metodunu çağırabiliriz
        //this.name = name;
        //Constructor can not be called by its name this() keyword need to be used
        this(name); // bu ifadeyle public Employee(String name) bu constructor çağırmış oluyoruz
        this.gender = gender;

    }

    public Employee(String name, char gender, String jobTitle){

//        this.name = name;
//        this.gender = gender;
        this(name, gender); // public Employee(String name, char gender) bu ifadeyle bu constructor çağırmış olduk this() içerisine parametre variable isimlerini yazmamız yeterli
        this.jobTitle = jobTitle;

        //this.jobTitle = jobTitle;
        //this(name, gender); bu şekilde constructor call işlemini ikinci ifadede yaparsak compile error alırız bu yüzden "Constructor call MUST be at the first step" kuralı geçerlidir
    }

    public Employee(String name, char gender, String jobTitle, double salary){
        this(name, gender, jobTitle); //  public Employee(String name, char gender, String jobTitle) bu ifade ile bu constructor çağırmış olduk
        this.salary = salary;

        //this(name); bu şekilde constructor içerisinde sadece bir defa constructor çağırabiliriz.Çünkü call ifadesi "Constructor call MUST be at the first step" kuralına uymalıdır bu yüzden bir constructor içerisinde sadece bir defa constructor çağrılabilir ve çağırma ifadesi de ilk başta yazılmalıdır
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
