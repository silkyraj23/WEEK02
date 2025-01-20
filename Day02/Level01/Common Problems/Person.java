public class Person {
    private String name;
    private int age;

    // Parametrized contructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy contructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Getter and setter mehtod to store private values
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

    // Display method to display the name and age of the person
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Person om = new Person("OM", 23);
        Person copyConstructor = new Person(om);
        om.display();
        copyConstructor.display();
    }
}