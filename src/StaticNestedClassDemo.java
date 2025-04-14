class Outer1{
    static class Inner{
        void show(){
            System.out.println("This is static inner class");
        }
    }
}

public class StaticNestedClassDemo {
    public static void main(String[] args) {
        Outer1.Inner obj = new Outer1.Inner();
        obj.show();

    }
}
