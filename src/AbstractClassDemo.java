abstract class Animal{
abstract void makeSound();//abstract method
void sleep(){//concrete method
    System.out.println("Sleeping...");
}
}


class Dog extends Animal{

    @Override
    void makeSound() {
        System.out.println("Dog barks..");
    }
}





public class AbstractClassDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();//call overridden method
        d.sleep();//call concrete method

    }
}
