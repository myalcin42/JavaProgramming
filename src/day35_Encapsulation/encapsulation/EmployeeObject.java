package day35_Encapsulation.encapsulation;

public class EmployeeObject {

    public static void main(String[] args) {

        Employee employee1 = new Employee("", 'Q', -1000, -200);
        //mesela setter larda belirlediğimiz önkoşulların aksi veri girişi yaptığımız için bu veriler set edilmeyecek
        System.out.println(employee1); // Employee{name='null', gender= , age=0, salary=0.0} koşullara uymayan verileri object oluştururken girdiğimiz için değer ataması yapmadı çünkü girilen verileri constructor içerisine koyduğumuz setter metotlar kontrol etti

        //mesela bir veriyi değiştirmek istersek
        employee1.setAge(32);

        System.out.println(employee1); // setters her bir instance için ayrı ayrı oluşturulur bu yüzden burada sadece değiştirmek istediğimiz age variable değiştirebildik

        Employee employee2 = new Employee("Aygun", 'F', 31, 115000);
        //setter olmasaydı herhangi bir değer verebilirdik ama setter metotlarında önkoşul oluşturduğumuz için range dışında veri girsek bile default değeri gösterilir yani set edilmez

//        employee2.setSalary(130000);
//        System.out.println(employee2.getSalary()); // ya da
        employee2.setSalary(employee2.getSalary() + 15000);
        employee2.setName("Elvira");
        System.out.println(employee2);
    }
}
