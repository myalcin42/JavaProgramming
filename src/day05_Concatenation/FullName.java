package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {

        String firstName = "Munur Yalcin";
        String lastName = "Saracoglu";
        String fullName = firstName + " " + lastName;
        //aradaki space tanımlamazsak isim ve soyisim bitişik olur
        int age = 45;
        String jobTitle ="SDET";
        String companyName ="Apple Inc";
        double salary = 100000.58;

        System.out.println("Full name of the person is " + fullName);

        System.out.println(fullName + " is " + age + " years old.");

        System.out.println(fullName + " is " + jobTitle + ",works at " + companyName
                + ",and " + fullName + "' salary is $" + salary + ".");

    }





}
