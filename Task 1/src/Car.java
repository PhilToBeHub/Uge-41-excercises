// 1.c
public class Car {

    public String make;
    public String model;
    public int year;
    public String bodyStyle;
    public String driver;

    // 1.d
    Car(String make, String model, int year, String bodyStyle) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.bodyStyle = bodyStyle;

    }

    // 1.e
    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver, int age) {
        this.driver = driver;
    }

    // 1.f
    public String toString() {
        return String.format("Make: "+make+". Model: "+model+ " ("+ year + "), BodyStyle: "+ bodyStyle);
    }
}


