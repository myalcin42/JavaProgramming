package day10_NestedIf;

public class NestedIfIntro {
    public static void main(String[] args) {

        int score = 95; // öğrenci notunun geçme kalma olasılığında iki koşul olduğu için
        //normalde if and else şablonu kullanılır ama burada not değerinin 0 ile 100 arasında
        //olması gerektiği için bir ön koşul bulunmaktadır.Bu durum nested if şablonunun
        //kullanılmasını gerektirir

        if(score >=0 && score <= 100){ //if the score is valid (pre-condition)

            if (score >= 60) { //if student passed the exam
                System.out.println("Passed");
            }else { // if the student failed the exam
                System.out.println("Failed");
            }

        }else{ //this is the else block of pre-condition
                //if the score is not valid
            System.out.println("Invalid Score");
        }
        //nested if formulünde bir if şablonunu if ile oluşturduğumuz başka bir ön koşul
        // şablonunun içerisine yerleştiriyoruz.Sınav notu örneğinde ön koşul notun 0 ile 100
        //arasında olmasıdır.Bu önkoşul için bir if statement oluşturulur.Daha sonra geri
        //kalan olasılıklar diğer if şablonları ile(kaç olasılık varsa if, if else ve multi branch)
        //bu ön koşul if şablonunun içerisine yerleştirilir.İlk önkoşul gerçekleşmezse
        //compiler diğer if koşulunu dikkate almaz bu yüzden en sona else ifadesi eklenir ki
        //önkoşulun sağlanmadığı diğer olasılık konsolda çıktı olarak execute olabilsin

        System.out.println("-----------------------------------------------");
        //alkol alabilme örneği
        int age = 25;
        boolean hasId = true; //ön koşul alkol alabilmek için önce kimliğin yanında olması

        if(hasId){ // if the person has Id

            if (age >= 21){ // if the person is 21 years old or older
                System.out.println("Eligible to buy alcohol");
            }else{ // if the person is less than 21 years old
                System.out.println("Not eligible to buy alcohol");
            }

        }else{ // eğer önkoşul gerçekleşmezse if the person does not have an ID
            System.out.println("You must have ID to buy alcohol");
        }

        System.out.println("----------------------------------------------");
        //sayıya göre günün ismini bulma görevi

        int number = 5;

        if(number>=1 && number <= 7){ //if the number is a valid number 1 ile 7 arasında
            //bir rakam olması gerekir çünkü haftada 7 gün var

            if(number == 1){
                System.out.println("Monday");
            } else if (number == 2) {
                System.out.println("Tuesday");
            } else if (number == 3) {
                System.out.println("Wednesday");
            } else if (number == 4) {
                System.out.println("Thursday");
            } else if (number == 5) {
                System.out.println("Friday");
            } else if (number == 6) {
                System.out.println("Saturday");
            }else{
                System.out.println("Sunday");
            }

        }else{
            System.out.println("Invalid Number");
        }

        //mesela numara 8 olursa compiler ön koşul gerçekleşmediği için aradaki if koşulunu
        //dikkate almaz ve direkt olarak sondaki else kısmını işletir
    }


}
