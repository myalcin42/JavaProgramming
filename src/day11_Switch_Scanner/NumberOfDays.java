package day11_Switch_Scanner;

public class NumberOfDays {

    public static void main(String[] args) {
            int year = 2000;
            int number = 9;

            String result = "";

            if(number >= 1 && number <= 12){ // number 1-12 arasında
              //Bu ifade boolean ifadesi olduğu için switch içerisinde kullanılamaz
                //Bu yüzden switch ifadesini bir ön koşul içeren if ifadesinin içerisine
                //yerleştirdik
                switch(number){
                    case 2:
                        if(year % 4 == 0){//Eğer yıl artık yılsa case 2 ifadesinin içerisine
                            //bu şekilde yerleştirilebilir
                            result = "29 Days";
                        }else {
                            result = "28 Days";
                        //bu if bloğunu ternary şeklinde de yazabiliriz
                        // result = (year % 4 == 0)? "29 Days" : "28 Days";
                        }
                        break;
                    case 4: case 6: case 9: case 11:
                        result = "30 Days";
                        break;
                    default: //1,3,5,7,8,10,12
                        result = "31 Days";
                        break; //yazmasanda olur
                }

            }else {
                        result = "Invalid Number";
            }

                        System.out.println(result);


    }


}
/*
4.NumberOfdays

        28 Days : 2
        30 Days : 4,6,9,11
        31 Days : 1,3,5,7,8,10,12
 */