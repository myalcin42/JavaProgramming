package day40_FinalKeyword;

public class FinalVariable {

    final String birthDay; //eğer instance variables için final belirlemek istersek hemen initialize etmediğimiz için compile error verir bu yüzden bu hatadan kurtulmak için constructor oluşturulur
    final static String name;

    static{
        name = "Batch 25";
    }

    public FinalVariable(String birthDay) { //constructor oluşturunca hata kayboldu
        this.birthDay = birthDay;
    }

    public static void main(String[] args) {

        final double pi = 3.14;
       // pi = 4.14; final variables can not be reassigned
       // pi = 5.4;

        final String name;
        name = "Java";

      //  name = "Wooden Spoon"; bir variable için final keyword kullandığımızda artık o nihai değerdir ve tekrar değiştirilemez yani yeniden atama yapılmaz

        System.out.println("=====================================");

        FinalVariable obj = new FinalVariable("May/01");
      //  obj.birthDay ="June/01"; final variables can not be reassigned
        System.out.println(obj.birthDay);

        System.out.println("===============================");

        //FinalVariable.name = "Python"; değiştiremezsin çünkü final
        System.out.println(FinalVariable.name); //Batch 25

    }
}
