package day39_Recap.cydeoTask;

public class Employee extends Person {

    private int employeeID;
    private String jobTitle;
    private double salary;


    public int getEmployeeID(){
        return employeeID;
    }

    public String getJobTitle(){
        return jobTitle;
    }

    public double getSalary(){
        return salary;
    }

    public void setEmployeeID(int employeeID){
        this.employeeID = employeeID;
    }

    public void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public void work(){
        System.out.println(getName() + " is working");
    }

    public Employee(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender);
        setEmployeeID(employeeID);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' + //
                ", age=" + getAge() +
                ", gender=" + getGender() +
                "employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
        //parent classda bulunan name age be gender variables private olduğu için inherit edilemez bu variablelar ile etkileşime geçmek için getter ve setter metodları kullanılır çünkü bu metotlar public olduğu için parent classdan inherit edilir
    }
}
/*
  2. Create a subclass of Person named Employee:
            Extra variables:
                employeeId, jobTitle, salary

            Encapsulate all the fields

            Add a constructor to set all the fields

            Methods:
                work()
                toString()
 */