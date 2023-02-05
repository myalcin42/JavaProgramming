package day05_Concatenation;

public class ShippingAddress {

    public static void main(String[] args) {
        //Eğer bütün data type değişkenleri aynıysa tek bir satırda yapabilirsin.Hepsi String se mesela
        //Bunu yapmak için her satırın sonunda verilen ; yerine , kullanabiliriz
        String name = "Munir Yalcin",
                buildingNumber = "11821B",
                streetName = "Jone Branch Dr",
                city = "McLean",  //Eğer başka bir string data tipi yoksa ; ile satırı tamamla
                                   // ama devam ediyorsa , koyup aşağı satıra geçebilirsin
                state = "VA",
                zipCode = "22031A";
        //Bu durumda yukarıdaki şekilde de yazılabilir ya da teker teker variable name atayabilirsin
        //Ama bütün variablelar aynı data tipi için olacak

       // System.out.println(name + "\n" + buildingNumber + " "
             //   + streetName + "\n" + city + ", " + state + " " + zipCode);
        //ya da bu yazdırma ifadesi hepsi string olduğu için tek bir değişken olarak atanabilir

        String address =name + "\n" + buildingNumber + " "
           + streetName + "\n" + city + ", " + state + " " + zipCode;

        System.out.println(address);




    }




}
/*
1. Create a class called ShippingAddress.java
2. Declare the following variables:
1. name
2. buildingNumber
3. streetName
4. city
5. state
6. zipCode
3. Use concatenation to print the full address
 */