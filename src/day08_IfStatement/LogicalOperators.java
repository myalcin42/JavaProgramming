package day08_IfStatement;

public class LogicalOperators {

    public static void main(String[] args) {
        //logical And Operator &&
        String name = "Steven";
        int age = 19;
        String citizen = "UK";

        boolean isEligible = age >= 18 && citizen == "USA";
        // &&(logical and operator) hem o hem bu olmak zorunda
        //iki şartı da sağlamak zorunda iki şartın birisi false olursa sonuç false olur

        System.out.println(name + " is eligible to vote: " + isEligible); //false olur

        System.out.println("==============================================");

        String name2 = "Josh";

        int creditScore = 720;
        int age2 = 23;
        int income = 40000;

        boolean isEligibleForLoan = creditScore >= 700 && age2 >= 21 && income >=60000;
        //logical and olduğu için bütün şartlar sağlanırsa true olur
        //koşul sayısı ne olursa olsun tek bir tanesi bile false olursa sonuç false olur
        System.out.println(name2 + " is eligible for loan: " + isEligibleForLoan);

        String name3 = "Shay";

        int age3 = 21;
        char gender = 'F';

        boolean isEligible3 = age3 >= 18 && (gender == 'M' || gender == 'F' );
        //                     21 > 18 &&  ( 'F' == 'M'    || 'F' == 'F'    )
        //                     true    &&  ( false         ||  true)
        //                     true  &&  true
        //                      true

        System.out.println(name3 + " is eligible to register: " + isEligible3);

        System.out.println("?????????????????????????????????????????????????????");



        //Logical or Operator(yukarıdaki örnekte kullanıldı)iki koşuldan birisi sağlarsa
        //true olur

        String name4 = "James";
        String countryOfBirth = "USA";
        boolean marriedToUSCitizen = false;

        boolean isEligibleForCitizenship = countryOfBirth == "USA" || marriedToUSCitizen == true;
        // ||(logical or kullanıldığı için iki koşuldan birisi sağlarsa true olur

        System.out.println(name4 + " is eligible to apply for US citizenship: " +
                isEligibleForCitizenship);

        System.out.println("_________________________________________________");

        String student = "Anna";
        double gpa = 3.5;
        int familyIncome = 100000;

        boolean isEligibleforScholarship = gpa >= 3.5 || familyIncome <= 60000;
        // iki koşuldan birisi true olduğu için diğer koşullar sağlamasa bile
        //logical or operator kullanıldığı için yeterli(koşul sayısı önemli değil
        //logical or da bir tanesi bile true ise sonuç true olur
        //ama logical and && kullanılırsa bütün koşullar sağlamak zorunda

        System.out.println("----------------------------------------------");
        // Logical Not operator tam zıttını atamak için kullanılabilir
        boolean result2 = true;
        System.out.println("result2 = " + result2);

        boolean result3 = !result2; //result2 true olarak atamıştık result3 için ise
        // logical not ! atadığımız için result12 tam tersi olacak








    }


}
