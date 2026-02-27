// wap to demonstrate inner class
package ASSIGNMENT_3;
public class InnerClass {

    class Inner {
        void show() {
            System.out.println("This is Inner Class");
        }
    }

    public static void main(String[] args) {
        InnerClass obj = new InnerClass();
        InnerClass.Inner in = obj.new Inner();
        in.show();
    }
}
