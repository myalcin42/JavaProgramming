package day11_Switch_Scanner;


public class Grade {

    public static void main(String[] args) {
        char grade = 'B';
        String result = "";
        switch(grade){

            case 'A':
                result ="Excellent";        //System.out.println("Excellent");
                break;
            case 'B':
                result = "Great Job";            //System.out.println("Great Job");
                break;
            case 'C':
                result = "Good";              //System.out.println("Good");
                break;
            case 'D':
                result= "Passed";                  //System.out.println("Passed");
                break;
            case 'F':
                result = "Failed";                   //System.out.println("Failed");
                break;

            default:
                result = "Invalid";              //System.out.println("Invalid Grade");
                break;
        }


            System.out.println(result); //print ifadesi switch dışına yazılır bu durumda
        //Burada bütün print ifadeleri aynı data tipini çıktı olarak veriyor(string)
        //Eğer tek bir print ifadesi kullanmak istersek string değeri atarız switch
        //ifadesinden önce



    }

}
