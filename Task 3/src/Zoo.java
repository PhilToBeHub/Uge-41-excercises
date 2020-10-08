import java.util.ArrayList;
import java.util.Arrays;

public class Zoo{
    ArrayList<Animal> animals =  new ArrayList<Animal>();


    public void makeAllSounds() {
        for (int i = 0; i < animals.size(); i++) {
            animals.get(i).makeSound();
        }
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }
    public void printNumberOfLegs() {
        int legs = 0;
        for (int i = 0; i < animals.size(); i++) {
            legs += animals.get(i).getNumberOfLegs();
        }
        System.out.println("Total number of legs in my zoo: "+legs);
    }
/*
add a Collection of the type Animal called "animals", e.g. an ArrayList (make sure to initialize it).
add a method called makeAllSounds(). This must loop through all elements in the above collection and call the makeSound() on the element.
add a method called addAnimal() that takes in a new Animal as a parameter and adds it to the animals collection.
add a method called printNumberOfLegs() that loops through all elements in the animals collection and sums up the number of legs before printing ("Total number of legs in my zoo: "+legs);
 */

}
