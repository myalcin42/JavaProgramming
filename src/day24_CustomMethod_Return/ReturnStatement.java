package day24_CustomMethod_Return;

public class ReturnStatement {

    public static void main(String[] args) {

        nameOfDay(10); // if(number < 1 || number > 7) bu koşul sağladığı için System.out.println("Invalid"); bu ifadeyi yazdırır ve sonrasında return branching statement ifadesi olduğu için mevcut metottan çıkar.Yani public static void burada void olmasına rağmen return yine de kullanılabilir ama herhangi bir değer döndürmez sadece mevcut metottan çıkar


    }

    ////4. Create a method that can print the name of the day based on the given number to the method
    public static void nameOfDay(int number){
        if(number < 1 || number > 7){
            System.out.println("Invalid");
            return; // exits nameOfDay method. break kullanamazsın çünkü break switch ve looplarda kullanılır.System.exit(0) ise bütün programı sonlandırır
        }

        if(number == 1){
            System.out.println("Monday");
        } else if (number == 2) {
            System.out.println("Tuesday");
        } else if (number == 3) {
            System.out.println("Wednesday");
        } else if (number == 4) {
            System.out.println("Thursday");
        } else if (number == 5) {
            System.out.println("Friday");
        } else if (number == 6) {
            System.out.println("Saturday");
        }else{
            System.out.println("Sunday");
        }
    }

}
