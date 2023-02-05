package homeWork;

public class CharacterIdentity {

    public static void main(String[] args) {
        char givenCharacter = '$';

        if(givenCharacter >=65 && givenCharacter <= 90 ||
                givenCharacter >= 97 && givenCharacter <= 122){
            System.out.println("Alphabetic Character");
        } else if (givenCharacter >=48 && givenCharacter <= 57) {
            System.out.println("Digit");
        }else{
            System.out.println("Special Character");
        }


    }


}
