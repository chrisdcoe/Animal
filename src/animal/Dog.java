
package animal;

public class Dog extends Animal {
    public Dog() {
        super(15); // references parent's constructor
        System.out.println("A dog has been created.");
    }
    
    public void eat() {
        System.out.println("A dog is eating");
    }
    
    public void sleep() {
        System.out.println("A dog is sleeping");
    }
    
    public void bark() {
        System.out.println("The dog barks.");
    }
    
    public void run() {
        System.out.println("The dog is running.");
    }
    
}
