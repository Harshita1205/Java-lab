class Parent {
    void show() {
        System.out.println("This is the parent class method.");
    }
}

public class MethodOverriding extends Parent {

    @Override
    void show() {
        System.out.println("This is the child class method (overridden).");
    }

    public static void main(String[] args) {
        MethodOverriding obj = new MethodOverriding();
        obj.show();
    }
}