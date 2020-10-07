import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 1.h
        Driver driver = new Driver("Philip", 26);
        // 1.i
        Car car = new Car("Audi", "A7", 2010, "Sportscar");


        // 1.j
        car.setDriver("Philip", 26);

        // 1.k
        System.out.println(car);
        System.out.println(driver);
        System.out.println(car.driver + " " + driver.age);


        // 1.l
        Car car2 = new Car("Ferrari", "458", 2015, "2-door berlinetta");
        car2.setDriver("Philip", 26);


        // 1.m
        System.out.println(car2);
        System.out.println(driver);
        System.out.println(car2.driver + " " + driver.age);

    }
}

/*
1.a Create a Driver.java class with the following private fields (use appropriate types):

Name
Age
1.b Create a constructor that populates all the fields above.
1.c Create a Car.java class with the following private fields (use appropriate types):

Make
Model
Year
BodyStyle
Driver

1.d Create a constructor, that populates all the fields above, except the Driver.
1.e Create a Getter and a Setter for the Driver variable.
1.f override the toString method in the Car class, returning: "Make: "+make+". Model: "+model+ " ("+ year + "),
BodyStyle: "+bodyStyle
1.g override the toString method in the Driver class, returning: " is driven by "+name



1.h In the main method, instantiate a new Driver, populating the fields with your own name and age.
1.i In the main method, instantiate a new car, populating the field with whatever values you see fit.
1.j In the main method, assign the driver to the car created, using the setter method created in step 1.e

1.k print the toString method of the car you've created followed by the toString method of the driver.

1.l In the main method, create yet another car and assign the same driver to this car.

1.m repeat the step 1.k for the new car created in 1.l.
 */