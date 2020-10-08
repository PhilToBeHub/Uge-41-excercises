public class Animal implements AnimalSound{

    public int numberOfLegs;

    Animal(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }


    @Override
    public void makeSound() {
        System.out.println(name() + " Undefined animal makes no sound.");
    }

    @Override
    public String name() {
        return "Unnamed";
    }


}
