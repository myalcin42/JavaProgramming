package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {

    public static void main(String[] args) {

        Car car1 = new Car();

        car1.setInfo("Toyota", "Camry", "White", 2021, 35000);
        //System.out.println(car1); // Car{brand='null', model='null', color='null', year=0, price= $0.0} hiçbir değer atamadan objeyi yazdırırsak bu şekilde çıktı verir

        System.out.println(car1); // Car{brand='Toyota', model='Camry', color='White', year=2021, price= $35000.0} bu yazım şekli object yazımı için default formattır

        Car car2 = new Car();
        car2.setInfo("BMW", "335is", "Black", 2020, 45000);

        System.out.println(car2); // Car{brand='BMW', model='335is', color='Black', year=2020, price= $45000.0}

        Car car3 = new Car();
        car3.setInfo("Audi", "Q7", "Red", 2019, 40000);

        System.out.println(car3); // Car{brand='Audi', model='Q7', color='Red', year=2019, price= $40000.0}

        //Bu objeleri bir data structure da depolamak istersek

      //  Car[] cars = {car1, car2, car3}; bu şekilde array oluşturabiliriz

        ArrayList <Car> carsList = new ArrayList<>();
        carsList.addAll(Arrays.asList(car1, car2, car3));

        for(Car each : carsList){
            System.out.println(each.brand + " : " + each.price);
        }

        System.out.println("==============================================");

        //mesela BMW 2005-2008, toyota 1995-1997 model arasında olanları çıkarmak istesek

        carsList.removeIf( p -> p.brand.equals("BMW") && p.year >= 2005 && p.year <= 2008);
        carsList.removeIf(p -> p.brand.equals("Toyota") && p.year >= 1995 && p.year <= 1997);
    }


}
