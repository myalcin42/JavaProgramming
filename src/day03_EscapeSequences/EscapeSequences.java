package day03_EscapeSequences;
/*
Escape sequences:Must be given with double quote
\n Newline: Advances the cursor to the next line for subsequent printing (yeni satıra aktarıyor)
\t Horizontal Tab :Causes the cursor to skip over to the next tab stop(Tab tuşu kadar ileri gider)
\\ Backslash :Causes a backslash to be printed
\" Double quote :Causes a double quotation mark to be printed
 */
public class EscapeSequences {

    public static void main(String[] args) {

        System.out.println("Java \nPhyton \nC#");

        System.out.println("--------------------------------");

        System.out.println("Hello Cydeo \nHow are you all today? \nIt is nice to see you all! \nWhat class do we have next week?");

        System.out.println("-------------------------------");

        System.out.println("\tJava is Cool Programming Language");

        System.out.println("-------------------------------------");

        System.out.println("/ \\"); // in order to print one backward slash we need to give two backward slashes

        System.out.println("-------------------------------");

        System.out.println("my favorite show is \"game of thrones\""); // tırnak içerisinde göstermek istediğin kelime dizininin başına ve sonuna \" işareti koy



    }




}
