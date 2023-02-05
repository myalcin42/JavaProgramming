package day38_Inheritance.carTask;

public class Tesla extends Car{
    public Tesla(String model, int year, double price, String color, int miles) {
        super("Tesla", model, year, price, color, miles);
    }

    public void autoPilot(){
        System.out.println(brand + " " + model  + " in autopilot mode");
    }

  //  public void start(){ // bir metodun overridden metot olup olmadığı iki şekilde anlaşılır birincisi sol tarafta çıkan o ve yanındaki ok işareti diğer bir yöntem metodun üzerinde  @Overrride yazarız eğer compiler hata verirse overridden metot değildir vermezse overrridden metottur. intellij de sağa tıklayıp generate ve override methods kısayolunu kullanarak da overrride yapabilirsin.kısayol yaptığında seçenekler arasında object classına ait metotlar da gösterilecektir.çünkü Object classı java.lang paketi içerisindedir ve bütün classlar tarafından implicitly bir şekilde extend edilir yani bütün classların parent classıdır


    @Override
    public void start() {
        System.out.println("Say \"start\" to start " + brand + " " + model);
    }
}



