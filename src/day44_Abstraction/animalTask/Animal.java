package day44_Abstraction.animalTask;

public abstract class Animal { //abstract class is meant to be parent class bu yüzden final olamaz

    private String name;
    private final String breed;
    private final char gender;
    private int age;
    private String size;
    private final String color;

    public final static boolean canBreath;

    static{
        canBreath = true; // static bir final variable static blok içerisinde initialize edilebilir ve sonrasında bir koşul oluşturulabilir ama burada koşul gereksizdir çünkü final bir değer olduğu için değiştirilme ihtimali yok zaten if koşulunu önce yazarsan hata verir
        if(canBreath == false){
            throw new RuntimeException("Invalid");
        }

    }

    public Animal(String name, String breed, char gender, int age, String size, String color) {
        setName(name);
        this.breed = breed;
        if(!(gender == 'M'|| gender == 'F')){
            throw new RuntimeException("Invalid gender: " + gender);
        }
        this.gender = gender;
        setAge(age);
        setSize(size);
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()){
            throw new RuntimeException("Invalid name");
        }
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public final void drink(){
        System.out.println(name + " is drinking");
    }

    public abstract void eat(); //abstract methods are meant to be overridden bu yüzden final olamaz

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" + //getClass().getSimpleName() bu metot bu toString metodu subclasslara olduğu gibi inherit edileceği için hangi classda kullanılacaksa o classın ismini yazdırsın diye kullanılmıştır. sadece getClass metodu olursa package name dahil hepsini yazdırır bu şekilde sadece class ismini alır
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
/*
Animal Task:
		Create an abstract class named Animal:
			Variables:
				name, breed(final), gender(final),  age, size, color(final)

			Encapsulate all the fields

			Add a cosntructor that can set all the fields

			Methods:
				eat(); ==> different animals eat different foods
				drink() ==> all the animals drink water
				toString() ==> to display the full info of the animal
 */