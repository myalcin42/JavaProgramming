package day37_Inheritance.scrumTask;
                            //Tester IS A Employee, Tester IS A Person
public class Tester extends Employee{ // employee classı person classından extend yapmıştı tester classı da employee classından extend ettiği için hem person hem employee classına ait olan bütün değerleri inherit etmiş oldu yani dede çocuğuna bir ev veriyor çocuğun dedenin verdiği ev ile birlikte kendi evi de var. çocukta kendi çocuğuna hem dededen kalan evi ve ayrıca kendi evini veriyor şu anda en zengin torun olmuş oluyor aynen miras mantığı

    public Tester(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender, jobTitle, id, salary, companyName);
    }

    public void createTicket(){
        System.out.println(jobTitle + " " + name + " is creating ticket");
    }
    //bu classda classa özgü instance variable oluşturmadığımız için toString metot oluşturmaya da gerek yok çünkü employee classında oluşturmuştuk
}
