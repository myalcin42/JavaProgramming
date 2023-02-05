package day34_GarbageCollection_AccessModifiers;

public class CydeoStudent {

    public String studentName;
    public static String schoolName;

    public CydeoStudent(String studentName){
        this.studentName = studentName;
        schoolName = "Cydeo School";
    }
}


class CydeoStudentObject{

    public static void main(String[] args) {
        CydeoStudent student1 = new CydeoStudent("Jimmy");
        CydeoStudent student2 = new CydeoStudent("Kathy");

        System.out.println(student1.schoolName); // Cydeo School
        //burada static variable constructor içerisinde initialize edildi ve compiler hata vermedi ama tek ve sabit bir argüman(okul ismi bu örnekte) ve bütün objeler için aynı değeri içermesine rağmen constructor içerisinde initialize edildiği için her bir obje için yeni bir kopya oluştu bu yüzden bu yöntem efficient değildir yani you should not use a constructor or any other methods to set the static variables
    }
}
