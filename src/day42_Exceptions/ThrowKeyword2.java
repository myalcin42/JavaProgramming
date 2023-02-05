package day42_Exceptions;

import day39_Recap.shapeTask.Rectangle;

import java.util.NoSuchElementException;

public class ThrowKeyword2 {

    public static void main(String[] args) {

        throw new NoSuchElementException("There is no such element as break"); // bu şekilde exception objesi oluşturulur.exception mesajı vermek istersek parantez içerisine masaj yazılabilir

     //   System.out.println("hello"); throw exception ifadesinden sonra kod yazamayız.unreaachable statement hatası alırız. throw keyword ile checked exception classından bir obje de oluşturulmaz sadece unchecked

    //    throw new Rectangle(5,7); throw keyword ile exception olmayan bir classdan obje oluşturulamaz hata verir
    }
}
