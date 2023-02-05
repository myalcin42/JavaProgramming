package day39_Recap.cydeoTask;

public class Tester extends Employee{


    public Tester(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender, employeeID, jobTitle, salary);
    }

    public static void createTicket(){
//        System.out.println(getJobTitle() + " " + getName() + " is creating ticket");
    }

    public void work(){
        System.out.println(getJobTitle() + " " + getName() + " is testing the application");
    } //bir child classda bir metodun sadece bir kez overrride işlemi yapılabilir aynı classda bir metodun iki farklı implementation olamaz
}
/*
  3. Create a sub class of Employee named Tester

            Override the work method

            Extra methods:
                createTicket()
 */