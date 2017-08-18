import java.util.ArrayList;

/**
 * Created by froilan on 8/18/17.
 */
public class Farm {



    public static void main(String[] args){
        //Create instances of each of my dogs
        GermanShepard myDog = new GermanShepard();
        SaintBeernard myOtherDog = new SaintBeernard();

        // group my dogs in an array because they share the
        // same parent class
        ArrayList<Dog> kennel = new ArrayList<Dog>();
        kennel.add(myDog);
        kennel.add(myOtherDog);

        // Create a bunch of instances of objects I want to ride
        Horse myHorse = new Horse();
        Tractor myTractor = new Tractor();
        CropDuster myPlane = new CropDuster();

        // Create my farmer
        Farmer me = new Farmer();

        // Send unrelated object types into a method of my farmer
        // this works because they share the same method
        me.rideSomething(myPlane);
        me.rideSomething(myTractor);
        me.rideSomething(myHorse);

    }
}

abstract class Dog {
    public void speak() {
        System.out.println("Bow Wow");
    }

     public void wagTail(){
         System.out.print("Wag Wag Wag ...");
    }
}

class GermanShepard extends Dog {
    @Override
    public void speak() {
        System.out.println("I'm a german shepard, bet didn't know we could talk");
    }

    public void protect() {

    }

    public void shepard() {

    }
}

class SaintBeernard extends Dog {
    public void saveSkiers(){

    }
}

class Horse implements Ridable{
    public void gallop(){

    }

    public void mount(){}
    public void dismount(){}
}

class Tractor implements Ridable{
    public void tractorThings(){

    }
    public void mount(){}
    public void dismount(){}
}

class CropDuster implements Ridable{
    public void mount(){}
    public void dismount(){}

}

class Farmer{
    public void rideSomething(Ridable whatImRiding){
        whatImRiding.mount();
    }

}