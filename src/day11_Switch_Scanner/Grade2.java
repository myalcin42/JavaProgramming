package day11_Switch_Scanner;

public class Grade2 {

    public static void main(String[] args) {

        char grade = 'A';
        String result = "";

        switch(grade){ //Burada 'A' karakteri olduğu için case 'A' will be executed
            case 'A'://ama burada bişey olmadığı için next block will be executed
            case 'B':// burada da bişey olmadığı için next block will be executed
            case 'C'://burada da bişey olmadığı için next block will be executed
            case 'D'://bu blok execute olacak ve konsolda çıktı olacak
                result = "Passed"; //case ifadeleri aynı sonucu verecekse yanyana yazılabilir
                                    //case 'A': case 'B': case 'C': case 'D':(bu şekilde)
                break; //Bu görevde switch boolean or(||) ifadesini kabul etmediği için
                        // bu şekilde yaptık

            case 'F':
                result = "Failed";
            default:
                result = "Invalid";

        }

            System.out.println(result);

    }

}
/* if the grade is A or B or C or D =====> "Passed"
otherwise ==> "Failed"
 */