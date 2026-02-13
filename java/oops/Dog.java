// Class
public class Dog {
    String name; // all 4 are the instance variables
    String breed;
    int age;
    String color;

    // Constructor
    public Dog(String name, String breed, int age, String color){
        this.name = name; //this keyword distinguishes the class variable
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    public String getName(){
        return name;
    }
    public String getBreed(){
        return breed;
    }
    public int getAge(){
        return age;
    }
    public String getColor(){
        return color;
    }

    public String toString(){
        return "Name is: " + name + "\nBreed age and color are: " + breed + " " + age + "and color " + color;

    }

    public static void main(String [] args){
        Dog tuffy = new Dog("tuffy", "papillon", 5, "black");
        System.out.println(tuffy);
    }

}
