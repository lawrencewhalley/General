import java.util.ArrayList;
import java.util.Scanner;

public class Student {

    Scanner ClassScanner = new Scanner(System.in);
    private int StudentID;
    private String FirstName;
    private String Surname;
    private ArrayList<Integer> HomeworkMarks = new ArrayList<Integer>();
    private Float InterimTest;
    private Float Exam;
    private Float FinalMark;
    private Float CourseWork;




    public Student(){

        getStudentID();
        getFirstName();
        getSurname();
        getInterimTest();
        getExam();
        getFinalMark();
        getHomeworkMarks();
        getCourseWorkMark();

        for (int i = 0; i < HomeworkMarks.size(); i++) {
            System.out.println(HomeworkMarks.get(i));
        }






    }
    public void getStudentID(){
        System.out.println("Enter the student's ID: ");
        int InputVariable = ClassScanner.nextInt();
        StudentID = InputVariable;

    }

    private void getFirstName(){
        System.out.println("Enter the student's first name: ");
        String clearCache = ClassScanner.nextLine();
        String InputVariable = ClassScanner.nextLine();
        FirstName = InputVariable;
    }

    private void getSurname(){
        System.out.println("Enter the student's surname: ");
        String InputVariable = ClassScanner.nextLine();
        Surname = InputVariable;
    }

    private void getInterimTest(){
        System.out.println("Enter the student's interim test result: ");
        Float InputVariable = ClassScanner.nextFloat();
        InterimTest = InputVariable;
    }

    private void getExam(){
        System.out.println("Enter the student's exam result: ");
        Float InputVariable = ClassScanner.nextFloat();
        Exam = InputVariable;
    }

    private void getFinalMark(){
        System.out.println("Enter the student's final mark: ");
        Float InputVariable = ClassScanner.nextFloat();
        FinalMark = InputVariable;
    }

    private void getHomeworkMarks(){
        int homeworkNumber = 1;
        for (int i = 0; i < 5; i++){
            System.out.println("Enter the student's mark for homework " + homeworkNumber + ": ");
            int Mark = ClassScanner.nextInt();
            HomeworkMarks.add(Mark);
            homeworkNumber = homeworkNumber + 1;
        }
    }

    private void getCourseWorkMark(){

        int j = 1;
        int min1 = HomeworkMarks.get(0);
        int min2 = HomeworkMarks.get(0);

        for (int i = 0; i < HomeworkMarks.size(); i++) {
            int mark1 = HomeworkMarks.get(i);
            if (mark1 < min1) {
                min1 = i;
            }
        }
        HomeworkMarks.remove(min1);
        for (int i = 0; i < HomeworkMarks.size(); i++) {
            int mark2 = HomeworkMarks.get(i);
            if (mark2 < min2) {
                min2 = i;
            }
        }
        HomeworkMarks.remove(min2);





    }






}