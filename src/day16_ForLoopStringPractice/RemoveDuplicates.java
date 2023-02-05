package day16_ForLoopStringPractice;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "aabbaacc";
        String result = ""; //çıktı abc olması lazım tekrarlayan harfleri bir kere yazdır
                        // i <= str.length() - 1 ile i < str.length() aynıdır
        for (int i = 0; i <= str.length() - 1 ; i++) { // i:represents all the index numbers of str(start from 0)
            //char ch = str.charAt(i); //represents each character of str
            String ch = "" + str.charAt(i); //"" işareti koymazsak sonuç char tipinde olacağı için hata verir
            if(! result.contains(ch)){ //if the character is not contained in the result
                //yukarıdaki gibi ch variable'ı char olarak atarsak contains() metodu içerisinde String olması gerektiği için hata verir.Bu yüzde ifadeyi String olarak atarız.char data tipini boş "" ile concatenation yaparsak onu String ifadeye çevirmiş oluruz
                result += ch; //the character will be added to the result
            }
                System.out.println(result);
        }



    }

}
/*
2. Write a program that can remove the duplicated characters from a String
			Ex:
				input:
					AABBCCBC

				Output:
					ABC

	Hint: You can add each characters of the string into another String
    Condition: the character is not contained in the other String yet before you are adding
 */