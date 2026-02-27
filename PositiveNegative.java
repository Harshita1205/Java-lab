//1. Write a Java Program to check if a number is Positive or Negative. (Use constructor, use respective member function).
package ASSIGNMENT_2;
public class PositiveNegative {
    int num;
    PositiveNegative(int n) {
        num = n;
    }
    void check() {
        if (num >= 0)
            System.out.println("Number is Positive");
        else
            System.out.println("Number is Negative");
    }

    public static void main(String[] args) {
        int number = -5;
        PositiveNegative obj = new PositiveNegative(number);
        obj.check();
    }
}
