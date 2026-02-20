package oops.inheritance;

public class Main {

    public static void main(String [] args){
        Box box1 = new Box(5, 8,6);
        Box box2 = new Box(box1);
       System.out.println(boxl.l + " " + box1.w + " " + box1.h);

    BoxWeight box3 = new BoxWeight();
    BoxWeight box4 = new BoxWeight(2, 8, 3, 8);
    System.out.println(box3.h + " " + box3.weight);
    }
   
}
