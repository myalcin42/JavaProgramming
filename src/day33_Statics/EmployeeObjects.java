package day33_Statics;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.name = "Ahmet";
        Employee employee2 = new Employee();
        employee2.name = "Aygun";
        Employee employee3 = new Employee();
        employee3.name = "Fady";

        System.out.println(employee1.name);// Fady
        System.out.println(employee2.name); // Fady
        System.out.println(employee3.name); // Fady
        // public static String name diğer class da variable instance değil de static olarak tanımladığımız için sadece tek bir kopya oluştu( static means : all the objects have the same value) ve bu yüzden 3.objeye atadığımız isim diğerlerine de atanmış oldu bu yüzden Employee classında name data değerini instance olarak değiştiririz
    }

}
