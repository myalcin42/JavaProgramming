package day32_Constructor;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Aaron");
        System.out.println(employee1); // Employee{name='Aaron', gender= , jobTitle='null', salary=0.0} oluşturduğumuz constructor sadece name attribute set ettiği için diğer alanlar default olarak yazıldı

        Employee employee2 = new Employee("Yuliya", 'F');
        System.out.println(employee2); // Employee{name='Yuliya', gender=F, jobTitle='null', salary=0.0}

        Employee employee3 = new Employee("Olga" ,'F', "SDET");
        System.out.println(employee3); // Employee{name='Olga', gender=F, jobTitle='SDET', salary=0.0}
    }
}
