package day39_Recap.shapeTask;

public class Shape {

    private String name; //şimdiye kadar inheritance konusunda variable private yapmamıştık ama doğrusu bu şekilde private yapmak getter ve setter public instance metotlar olduğu için ve inherit edilebildiği için child classlar tarafından bu variable erişilebilir (private olmasına rağmen)

    public String getName(){
        return name;
    }

    public void setName(String name){
        if(name == null){
            System.err.println("name can not be null");
            System.exit(1); //1: something went wrong
        }

        if(name.isEmpty() || name.isBlank()){
            System.err.println("Invalid name");
            System.exit(1);
        }
        this.name = name;
    }

    public Shape(String name){
        setName(name);
    }

    public double area(){
        return 0; //bu metot her şekil için farklı bir implementation içereceğinden overrride yapılabilir ve ana classda oluşturduğumuz bu metot mutlaka bir body'ye sahip olması gerektiği için return 0 denilebilir(abstraction konusunu gördüğümüzde body olmadan metot oluşturmayı öğreneceğiz)
    }

    public double perimeter(){
        return 0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
