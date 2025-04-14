interface Animals{
    void makeSound();//abstract method
}

class Dogs implements Animals{

    @Override
    public void makeSound() {
        System.out.println("Dog barks.");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Dogs dogs = new Dogs();
        dogs.makeSound();

    }
}
