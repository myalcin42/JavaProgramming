package day10_NestedIf;

public class NameOfMonth2 {
    public static void main(String[] args) {
        int n = 5;

        String result = (n ==1) ? "January" :(n == 2) ? "February" :(n == 3)? "March" :(n == 4) ? "April"
                :(n==5) ? "May" :(n==6) ? "June" :(n==7) ? "July" :(n==8) ? "August"
                :(n==9)? "September" :(n==10)? "October" :(n==11)? "November" : "December";

        System.out.println(result);
        //regular if stamentda koşul parantez içerisinde varilmek zorunda if() gibi
        //ama ternary de koşulun bulunduğu parantez opsiyoneldir ama kullanmak daha sağlıklı
        //olur.Ternary de ? işareti sayısı ile : işareti sayısı aynı olmak zorunda

    }
}