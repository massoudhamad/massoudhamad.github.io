
/**
 * Write a description of class Example01 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Animal
{
    String name;
    void eat()
    {
        System.out.println(name + " is eating");
    }
}

class Dog extends Animal{
    void bark()
    {
        System.out.println(name + " says Woof!");
    }
}