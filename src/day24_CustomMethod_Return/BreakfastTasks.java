package day24_CustomMethod_Return;

public class BreakfastTasks {

    public static void main(String[] args) {
        initials("Cydeo" , "school"); //C.S

        System.out.println("----------------------------------");

        domain("cydeo@gmail.com");

        System.out.println("----------------------------------------");

        String[] emails = { "josh@gmail.com" , "Jim@yahoo.com" , "Elminur@cydeo.com" , "Gulsen@gmail.com"};

        for (String email : emails) {
            domain(email);//oluşturduğumuz domain metodunu bir array için kullandık

        }

        System.out.println("-------------------------");

        nameOfMonth(11);

        nameOfTheDay(5);
    }

    //1. Create a method that can display the initials of the person
    public static void initials(String firstName , String lastName){
        String initial = firstName.charAt(0) + "." + lastName.charAt(0);
        initial = initial.toUpperCase();
        System.out.println("initial = " + initial);
    }

    //2. Create a method that can display the domain of the email
    public static void domain(String email){
        String domain = email.substring(email.indexOf("@") + 1 , email.lastIndexOf("."));
        System.out.println("domain = " + domain);
    }


    //3. Create a method that can display the name of the month based on the given number to the method
    public static void nameOfMonth(int number){
        String name = "";
        if(number >= 1 && number <= 12){

            name = (number == 1)? "Jan" :(number == 2)? "Feb" :(number == 3)? "Mar" :(number == 4)? "Apr" :(number == 5)? "May" :(number == 6)? "June" :(number == 7)? "July" :(number == 8)? "Aug" :(number == 9)? "Sep" :(number == 10)? "Oct" :(number == 11)? "Nov" : "Dec";
        }else{
            name = "Invalid";
        }
        System.out.println("Month name = " + name);

    }

    //4. Create a method that can print the name of the day based on the given number to the method
    public static void nameOfTheDay(int number){
        String day = "";
        if(number >= 1 && number <= 7){
            day = (number == 1)? "Monday" :(number == 2)? "Tuesday" :(number == 3)? "Wednesday" :(number == 4)? "Thursday" :(number == 5)? "Friday" :(number == 6)? "Saturday" : "Sunday";
        }else{
            day = "Invalid";
        }
        System.out.println("Day is = " + day);
    }

    //5. Create a method that can print how many days a month has
    public static void daysInMonth(int number){

    }



}
/*
Warmup tasks:
	1. Create a method that can display the initials of the person

	2. Create a method that can display the domain of the email

	3. Create a method that can display the name of the month based on the given number to the method

	4. Create a method that can print the name of the day based on the given number to the method

	5. Create a method that can print how many days a month has

 */