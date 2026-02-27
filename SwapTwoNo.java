//3. Write a Java program to swap two numbers (Use Constructor, Create two objects, Create swap member function).
package ASSIGNMENT_2;

public class SwapTwoNo {

    int num;
    SwapTwoNo(int n) {
        num = n;
    }

    // Swap member function
    void swap(SwapTwoNo obj) {
        int temp = this.num;
        this.num = obj.num;
        obj.num = temp;
    }

    void display() {
        System.out.println(num);
    }

    public static void main(String[] args) {

        SwapTwoNo obj1 = new SwapTwoNo(10);
        SwapTwoNo obj2 = new SwapTwoNo(20);

        obj1.swap(obj2);

        System.out.println("After Swapping:");
        obj1.display();
        obj2.display();
    }
}

