package day15_ForLoop;

import java.util.Scanner;

public class FormatFullName {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Enter your first name:");
        String firstName = input.next();
        System.out.println("Enter your last name");
        String lastName = input.next();



        //firstName.charAt(0).toUpperCase (İlk kelimenin ilk harfini charAt metoduyla
        //bu şekilde çağırabiliriz ama bu ifade char data tipinde döneceği için
        //toUpperCase metodunu uygulayamayız(Çünkü sadece String data tipine böyle karışık
        //metotlar uygulanabilir String metodu oldukları için.Bu yüzden substring ile yapacağz

        // firstName = firstName.substring(0 , 1).toUpperCase() + firstName.
        //substring(1).toLowerCase(); bu bir yöntem cyDEo kelimesinin ilk harfini
        //substring ile çağırdık ve onu büyük harf olarak değiştirdik ve geri kalan harfleri de
        //küçük harfe değiştirdik.Diğer bir yöntem;

        firstName = ("" + firstName.charAt(0)).toUpperCase() +
                firstName.substring(1).toLowerCase();
        //charAt metodu char data tipi döndüreceği için, bir String metodu olan toUpperCase
        //metodunu doğrudan kullanamayız.Bu yüzden firstName.charAt(0) bu ifadeyi concatenation
        //ile bir Stringe dönüştürürüz ve parantez içerisine alırız ki parantez içerisindeki ifadenin
        //tamamı toUpperCase metodunu işleme alabilsin

        lastName = lastName.substring(0 ,1).toUpperCase() +
                lastName.substring(1).toLowerCase();


        System.out.println(firstName); //Cydeo çıktısını verir
        System.out.println(lastName);  //School çıktısını verir

        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

    }


}
/*
3. Write a program that asks user to enter first and last names,
and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School
 */