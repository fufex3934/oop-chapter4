interface A{
    void methodA();
}

interface B{
    void methodB();
}

class C implements A,B{

    @Override
    public void methodA() {
        System.out.println("methodA from interface A.");
    }

    @Override
    public void methodB() {
        System.out.println("methodB from interface B.");
    }
}
public class MultiInheritanceByInterfaceDemo {
    public static void main(String[] args) {
        C obj = new C();
        obj.methodA();
        obj.methodB();

    }
}
