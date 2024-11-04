import java.util.Scanner;
class student{
    // data members of class
    int studentId;
    String studentName;
    int studentAge;
    Scanner scanner = new Scanner(System.in);

    // member functions 
    public void acceptDetails() {
        System.out.println("Enter Student Id : ");
        studentId = scanner.nextInt();
        System.out.println("Enter Student Name : ");
        studentName = scanner.next();
        System.out.println("Enter Student Age : ");
        studentAge = scanner.nextInt();
    }
    public void displayDetails() {
        System.out.println("Student Id : " + studentId);
        System.out.println("Student Name : " + studentName);
        System.out.println("Student Age : " + studentAge);

    }

}

public class ClassesAndObjects {

    public static void main(String[] args) {

        // Creating an Object of Class Student
        student Student = new student();
        Student.acceptDetails();
        Student.displayDetails();

        // create multiple Objects
        student StudentTwo = new student();
        StudentTwo.acceptDetails();
        StudentTwo.displayDetails();
        

    }

    
}
