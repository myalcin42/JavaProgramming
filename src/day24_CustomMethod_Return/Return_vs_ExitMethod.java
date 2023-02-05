package day24_CustomMethod_Return;

public class Return_vs_ExitMethod {

    public static void main(String[] args) {

        nameOfMonth(50); // return sadece mevcut metottan çıkar

        System.out.println("Hello World"); //nameOfMonth metodunda  System.exit(0); komutu olduğu için bu ifade yazdırılmaz


    }

    public static void nameOfMonth(int number) {
        if (number < 1 || number > 12) { // if number is invalid
            System.out.println("Invalid");
           // return; // exits nameOfMonth method. void olmasına rağmen sadece metottan çıkmak için kullanıyoruz burada sadece branching statement işlevi görüyor remaining code fragments of the method never gets executed
            System.exit(0); //bütün programdan çıkar sadece tek bir metottan değil
        }

        String name = (number == 1) ? "Jan" : (number == 2) ? "Feb" : (number == 3) ? "Mar" : (number == 4) ? "Apr" : (number == 5) ? "May" : (number == 6) ? "June" : (number == 7) ? "July" : (number == 8) ? "Aug" : (number == 9) ? "Sep" : (number == 10) ? "Oct" : (number == 11) ? "Nov" : "Dec";

        System.out.println("Month name = " + name);
    }
}
