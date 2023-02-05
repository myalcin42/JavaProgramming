package day11_Switch_Scanner;

public class DaysInWeek {

    public static void main(String[] args) {
      //Switch statement daha hızlıdır if statement göre ama if daha kapsamlı ve güçlüdür

        int number = 5;
       /*
        if(number == 1){
            System.out.println("Monday");//Bu görevi if ile yapsaydık bu şekilde devam
            ederdik.Ama Switch statement if den performans olarak daha hızlıdır
            number == 1 bu şekilde eşitlik olan durumlarda switch kullanılabilir
            Başka bir boolean ifadesi switch de kesinlikle kullanılamaz
            Long, double ve float da kullanılamaz
        }
        */

        switch (number) { // sadece == ifadesi için switch kullanılabilir başka bir boolean
            //ifadesi (>= gibi ) kesinlikle kullanılamaz

            case 1:    //case yanındaki value switch içerisinde verilen data tipiyle uyumlu
                //olmak zorunda.Burada number int ve case yanındaki 1 de int
                System.out.println("Monday");
                break; //zorunlu değildir ama bunu yazmazsan ve eğer verilen değer case de
            //verilen değerle aynı olursa compiler diğer case lere bakmaya
            //devam eder.Burada ise break dediğimiz zaman koşul gerçekleşirse
            //switch işlemi durdurulur ve çıkış yapılır
            case 2:     //farklı case ifadeleri aynı data değerini kullanamaz.Must be unique
                //ama if ifadelerinde bütün else if ifadelerinde aynı koşul kullanılabilir
                System.out.println("Tuesday");
                break; // exits the switch after executing the case block
            case 3:  //mesela burada case 2: dersen compiler hata verir
                System.out.println("Wednesday");
                break;  //exits the switch after executing the case block

            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

                //Switch statements is not designed for boolean expressions sadece == eşitlik
                // durumunda kullanılır.Diğer comparison ifadeleri için switch olmaz
                // switch tek faydası daha hızlı.*******!!!!Mesela burada rakam 5 ve çıktı
            //Friday olacak.Eğer if ifadesi kullanılsaydı compiler 5 e kadar olan bütün
            //olasılıkları kontrol edecekti ama switch ifadesinde sadece 5. case bloğu doğrudan
            //execute edilir ve sonrasında break ifadesi olduğu için switch ifadesinden çıkış
            //yapılır !!!!!!**** ama eğer break ifadesi yazılmasaydı 5. case durumundan sonra
            //compiler çıkış yapmayacağı için 6.case durumunu da data değerine bakmaksızın
            //işletecekti ve çıktıda Saturday de olacaktı.Bu yüzden break zorunlu değil ama
            //kullanılmalıdır.switch sadece break ya da kapanış } işaretini gördüğünde işlemi
            //durdurur başka şekilde kendi çıkış yapamaz
            // switch Tek faydası hızlıdır
            //Eğer verilen değer case values ile eşleşmezse(yani bu örnekte sayı değeri 1 ile
            // 7 arasında olmazsa !!!! default kod bloğu kullanılır

            default: //else ifadesine benzer case koşullarının hiçbiri uymazsa bu execute edilir
                System.out.println("Invalid");
                break; //bu ifadeden sonra } işareti olduğu için break kullanmazsak bile
                        //switch sona erer.Yani sadece burada kullanmasak da olur
            //Her switch ifadesinde sadece 1 tane default olur ve default switch
            //bloğunun herhangi bir kısmına yazılabilir ama arada olduğu zaman break
            //kullanmak gereklidir ama switch ifadesinin sonunda default kullanmak
            //daha sağlıklı bir yöntemdir


        }



    }




}
