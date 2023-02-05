package day43_Abstraction.employeeTask;

public abstract class Employee extends Person{ //Employee classı abstract olduğu için sadece constructor çağırdıktan sonra compiler error kalktı ama abstract olmasaydı parent classdaki abstract metot overrride edilmek zorundaydı

    private final int id;
    private String jobTitle;
    private double salary;

    public Employee(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender);
        if(id <= 0){
            throw new RuntimeException("Invalid ID: " + id); //id final bir variable olduğu için setter metodu uygulanmaz eğer final variablelar için bir önkoşul varsa constructor içerisinde tanımlanır
        }
        this.id = id;
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public int getId() {
        return id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void work();

    @Override
    public String toString() {
        return "Employee{" +
                "name=" + getName() +
                "age=" + getAge()+
                "gender=" + getGender() +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}