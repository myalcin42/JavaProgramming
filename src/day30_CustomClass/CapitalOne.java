package day30_CustomClass;

public class CapitalOne {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        Employee employee5 = new Employee();

        employee1.setInfo("John", 'M', 25,2237,"Developer", 100000,true);

        employee2.setInfo("Anna", 'F', 28,2287,"QA",85000,true);

        employee3.setInfo("David", 'M', 35,2256,"QA",45000,false);

        employee4.setInfo("Lina", 'F', 45,2290,"Manager", 80000,true);

        employee5.setInfo("Kevin", 'M',35,2298,"Senior QA", 110000,true);


        Employee[] employees = {employee1, employee2, employee3,employee4,employee5};

        int countFullTime = 0;
        int countPartTime = 0;
        double maxSalary = employees[0].salary;
        double minSalary = employees[0].salary;

        for (Employee employee : employees) {

            if(employee.isFullTime){
                countFullTime++;
            }else{
                countPartTime++;
            }

            if(employee.salary > maxSalary){
                maxSalary = employee.salary;
            }

            if(employee.salary < minSalary){
                minSalary = employee.salary;
            }
        }



    }

}
