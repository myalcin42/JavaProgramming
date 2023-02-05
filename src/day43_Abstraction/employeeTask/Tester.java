package day43_Abstraction.employeeTask;

public final class Tester extends Employee{ // Employee classı abstract bir class ve kendi abstract metodu var.Employee Person classının(abstract class) child classı olduğu için oradan gelen bir abstract metotta var bu yüzden Tester classı abstract class olmadığı için inherit ettiği iki abstract metodu da override etmek zorunda.Bu tester classının metotlarının inherit edilmesini istemediğim için Tester classını final yaptık


    public Tester(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is testing the application");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " sleeps 8 hours");
    }

    public void bugReport(){
        System.out.println(getName() + " is creating bug reports");
    }
}
