package day16_ForLoopStringPractice;

public class DigitsLettersSpecialChars {

    public static void main(String[] args) {

        String str = "Cydeo12345School!@#$%WoodenSpoon";
        //verilen bir ifadeden numaraları alfabetik harfleri ve özel karakterleri ayır

        String digits = ""; //12345
        String letters = ""; //CydeoSchoolWoodenSpoon
        String specialChars = ""; //!@#$%
                        //i <= str.length() - 1 (ya da böyle yazılır)
        for (int i = 0; i < str.length(); i++) {//i: represents the index numbers of str
            char ch = str.charAt(i); //ch: represents each character that we have in str

            if(ch >= '0' && ch <= '9'){ //if the character is between '0' to '9' then it is digit
                digits += ch;
            }else if(ch >= 'A' && ch <= 'Z'){ //if the character is between 'A' to 'Z' then it is letter
                letters += ch;
            }else if(ch >= 'a' && ch <= 'z'){ ///if the character is between 'a' to 'z' then it is letter
                letters += ch;
            }else{ //if the character is neither digit nor letter, then it is special character
                if(ch != ' '){ // space karakteriyse ekleme yapma(ignoring the space)
                    specialChars += ch;
                }

            }
        }
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);
    }


}
