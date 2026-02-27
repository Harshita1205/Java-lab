//6. Write a Java program for following grading system.
//        Note:
//Percentage>=90% : Grade A
//Percentage>=80% : Grade B
//Percentage>=70% : Grade C
//Percentage>=60% : Grade D
//Percentage>=40% : Grade E
//Percentage<40% : Grade F
package ASSIGNMENT_2;

public class Percentage {
    public static void main(String[] args) {
        int percentage = 85;   // constant value
        if (percentage >= 90)
            System.out.println("Grade A");
        else if (percentage >= 80)
            System.out.println("Grade B");
        else if (percentage >= 70)
            System.out.println("Grade C");
        else if (percentage >= 60)
            System.out.println("Grade D");
        else if (percentage >= 40)
            System.out.println("Grade E");
        else
            System.out.println("Grade F");
    }
}

