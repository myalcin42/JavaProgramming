package day10_NestedIf;

public class DaysInWeek {

    public static void main(String[] args) {

        int n = 5; //1 ile 7 arasında bir rakam değeri
        String day; //declaration

        if(n == 1){
            //System.out.println("Monday");
            day = "Monday"; //assignment
        } else if (n == 2) {
            //System.out.println("Tuesday");
            day = "Tuesday";
        } else if (n == 3) {
            //System.out.println("Wednesday");
            day = "Wednesday";
        } else if (n == 4) {
            //System.out.println("Thursday");
            day = "Thursday";
        } else if (n == 5) {
            //System.out.println("Friday");
            day = "Friday";
        } else if (n == 6) {
            //System.out.println("Saturday");
            day = "Saturday";
        }else{
            // System.out.println("Sunday");
            day = "Sunday";
        }

        System.out.println("day = " + day);//sürekli her if ifadesinden sonra print statement
        //kullanmak yerine day variable name String data tipine atarsak en sonunda sadece
        //bir tane print statement yeterli olacaktır

        //Bu görevde her bir if bloğunda tek bir değer var ve bütün değerler tek bir data
        //tipine ait.BU yüzden ternary kullanılabilir
        //nested if tipinde Muhtar ternary kullanmamızı istemiyor karışabilirmiş


        System.out.println("--------------------------------------------------");

        String result = (n == 1) ? "Monday" :(n == 2) ? "Tuesday" :(n == 3) ? "Wednesday" :(n == 4) ? "Thursday"
        :(n == 5)? "Friday" :(n == 6) ? "Saturday" : "Sunday";

        System.out.println(result);


    }



}
