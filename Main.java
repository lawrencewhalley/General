//Jordan Hayward (jh886 - 229028458)
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the number of students: ");

        Integer noOfStudents = myObj.nextInt();

        Student[] students = new Student[noOfStudents];

        for (int i = 0; i < noOfStudents; i++){
            students[i] = new Student();

        }
    }
}