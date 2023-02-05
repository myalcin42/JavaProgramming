package day04_Variables;

public class SalaryCalculator {

    public static void main(String[] args) {
        //hourly Rate , weeklyHours use this data to calculate salary

        int hourlyRate = 50;
        int weeklyHours = 40;

        int salary = hourlyRate * weeklyHours * 52;//1 yılda 52 hafta var

        //System.out.println("salary"); output olarak bu ifade sadece konsola salary yazar
        //Çünkü "" içerisinde java sadece text ifadsesi olarak algılar
        //Variable yazdırmak istersek "" kullanmamak gerekir

        // System.out.println(salary); doğrusu bu

        //eğer bir variable konsolda output görmek istersen short cut "soutv"

        System.out.println("hourlyRate = $" + hourlyRate);
        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("salary = $" + salary);

        //eğer başka bir çalışanın verilerini girmek istersek sadece yukarıdaki rakamları değiştir
        //52 hafta sayısı için de bir variable atanabilir "int numberOfWeeks = 52; olarak"



    }





}
