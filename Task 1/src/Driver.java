
// 1.a
public class Driver {
    public String name;
    public int age;

    // 1.b
    Driver(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 1.e
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 1.g
    public String toString() {
        return String.format(" is driven by " + name);
    }
}


