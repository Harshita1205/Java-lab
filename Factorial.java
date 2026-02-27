// wap to find the factorial of a number (...........................)
package ASSIGNMENT_3;
public class Factorial {

    int fact(int n) {
        int f = 1;
        for(int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {
        int num = 5;
        Factorial obj = new Factorial();
        int result = obj.fact(num);
        System.out.println("Factorial of " + num + " is: " + result);
    }
}