class Outer{
    class Inner{
        void display(){
            System.out.println("This is an inner class");
        }
    }
}



public class RegularInnerClassDemo {
    public static void main(String[] args) {
    Outer.Inner obj = new Outer().new Inner();
    obj.display();
    }
}
