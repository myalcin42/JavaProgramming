package day41_Exceptions;

import day39_Recap.cydeoTask.Employee;

public class MultiCatchBlocks {

    public static void main(String[] args) {

        Employee employee = null;
        //multi catch block konusu aynı else if koşulları gibi. Bir catch blok unchecked exceptionı tespit edemezse diğeri kontrol ediyor.yalnız parent class olan exception ilk sırada olamaz özelden genele gitmek zorunda, bir de checked exceptions için bu kullanılamaz

        try{
            System.out.println(employee.getSalary()); //null pointer exception
        }catch (IndexOutOfBoundsException e){
            System.out.println("first catch block");
            e.printStackTrace();
        }catch (ArithmeticException e){
            System.out.println("second catch block");
            e.printStackTrace();
        }catch (ClassCastException e){
            System.out.println("third catch block");
            e.printStackTrace();
        }catch (RuntimeException e){
            System.out.println("fourth catch block");
            e.printStackTrace();
            //hiçbir catch bloğunun exceptionı yakalayamama ihtimaline karşılık son bloğa run time exceptionsların parent classı olan RuntimeException classı yazılır garanti olsun diye.eğer ilk bloktaki excepitonı yakalarsa diğer blokların execute edilmesine gerek yoktur.parent class can not be placed before child class in multi catch blocks

        }

        System.out.println("test completed");

        System.out.println("===================================================");

        try{
            System.out.println("Java". charAt(-1));
        }catch (RuntimeException e){
            e.printStackTrace();
        }

    }
}
