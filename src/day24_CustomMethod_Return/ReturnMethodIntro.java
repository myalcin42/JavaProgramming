package day24_CustomMethod_Return;

public class ReturnMethodIntro {

    public static void main(String[] args) {
        String str = "Java";
        String result = reverse(str); //reverse metodunda void olsaydı return yerine, bu ifade compiler error verecekti ysni metot dışında kullanamayacaktık

        System.out.println(result);

        if(str.equalsIgnoreCase(result)){
            System.out.println(str + " is palindrome");
        }else{
            System.out.println(str + " is not palindrome");
        }


    }

    public static String reverse(String str){//Burada void kullanırsan metot içerisindeki variable değerlerini metot dışarısında kullanamazsın
        String reverse = ""; //void olursa bu değeri metot dışında kullanamazsın

        for(int i = str.length() - 1; i >= 0 ; i--){
            reverse += str.charAt(i);
        }
        return reverse; // reverse variable metot dışında kullanmak istersen yukarıda void yerine variable data tipini yani örneğe göre String yazarsın ve sonuna da bu şekilde return yazıp yanına variable yazarsın.Bu işlem variable reusable hale getirir
    }

}
