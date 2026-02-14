package oops.staticExample;

import oops.packages.a.Greeting;

public class Main {
    public static void main(String[] args) {
        Human kapil = new Human("Kapil", 20, 50000000, false);
        Human rahul = new Human("rahul", 25, 15784, true);

        System.out.println(kapil.name);
        System.out.println(rahul.name);
        System.out.println(Human.population);

        






        // Main funn = new Main();
        // funn.fun2();
        // static void fun(){
        //     Greeting();
        //     Main obj = new Main()
        //     obj.Greeting();
        // }

        // void fun2(){
        //     Greeting();
        // }

        // void Greeting(){
        //     fun();
        //     System.out.println("hello world");
        // }

    }
    
}
