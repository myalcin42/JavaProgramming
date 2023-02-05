package day11_Switch_Scanner;

public class Browsers {

    public static void main(String[] args) {
        String browserName = "edge";
        String result = "";
        //nested if örneği
        boolean validBrowser = browserName == "chrome" || browserName == "firefox"
                || browserName == "opera" || browserName == "edge"; //ön koşul için yazdık

        if(validBrowser){ //ön koşul; browser name yukarıdaki isimlerden birisi değilse geçersiz

            if(browserName == "chrome"){
                result = "Chrome Browser is Selected";
            } else if (browserName == "firefox") {
                result = "Firefox Browser is Selected";
            } else if (browserName == "opera") {
                result = "Opera Browser is Selected";
            } else if (browserName == "safari") {
                result = "Safari Browser is Selected";
            }else {
                result = "Edge Browser is Selected";
            }

        }else{
            result = "Invalid Browser Name";
        }

        System.out.println(result);


    }



}
