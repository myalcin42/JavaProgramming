package day09_IfStatements;

public class NameOfDay {

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

    }



}
