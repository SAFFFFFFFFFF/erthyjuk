package kz.aitu.dz;
public class Dog {
    private String name;
    private Integer age;
    private String color;
    public Dog(String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public void printName() {
        System.out.println("Dog's name is " + name);
    }
    public void printAge() {
        System.out.println(name + " is " + age + " years old");
    }
    public void printColor() {
        System.out.println("It's " + color + " colored");
    }
    public String getName() {
        System.out.println("Getter for name was called");
        return name;
    }
    public void setName(String newName) {
        if (newName == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }
        this.name = newName;
    }
    public void bark() {
        System.out.println(name + " is barking!");
    }

}
