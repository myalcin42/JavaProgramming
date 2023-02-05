package day14_String;

public class EmailDomain_Substring {

    public static void main(String[] args) {

        String email = "Cydeo.School@gmail.com";

        //we need to get the domain
        //Bütün mail adreslerinin domaini @ ile . arasındadır

        int beginningIndex = email.indexOf("@") + 1;
        int endingIndex = email.lastIndexOf(".");

        String domain = email.substring(beginningIndex , endingIndex);

        System.out.println(domain);

        System.out.println("----------------------------------------------");

        String str1 = "Java is fun, Java is cool, I love Java";

        //Java is fun sadece cümlenin bu kısmını almak istersek substring metodu kullanırız

        String s1 = str1.substring(0, 10+1); //sayarak yaptık //java is fun

        int beg = str1.indexOf(" J") + 1; //2nci J nin index numarası
        int end = str1.lastIndexOf(","); //I love dan önceki nokta

        String s2 = str1.substring(beg , end); //end indeks numarası hariç tutulur

        String s3 = str1.substring(str1.lastIndexOf("I"));//ending indeks gerek yoktur


        System.out.println(s1); //Java is fun
        System.out.println(s2); //Java is cool
        System.out.println(s3); //I love Java


    }


}
/*
1. Write a program that can gte the domain of the email.
( Assume that a valid email is given)

		Ex:
			email = Cydeo.School@gmail.com

		output:
			gmail


			email = "School.Cydeo@yahoo.com

		output:
			yahoo
 */