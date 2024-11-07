class constructors {
    // data members
    int studentId;
    String studentName;
    int studentAge;

 // default constructor
public constructors (){
   
    this.studentId = 101;
    this.studentName = "unknown";
    this.studentAge = 23;
}
// parameterized constructor
public constructors(int sId, String sName, int sAge){
    this.studentId=sId;
    this.studentName=sName;
    this.studentAge=sAge;

}

void displayDetails(){
    System.out.println("Student Id :" + studentId);
    System.out.println("Student Name :" + studentName);
    System.out.println("Student Age :" + studentAge);  
}

    
    public static void main(String[] args) {

        // constructor overloading
        
        constructors student = new constructors();
        student.displayDetails();

        System.out.println("*****************");

        constructors student1 = new constructors(102, "priya" ,87);
        student1.displayDetails();

        System.out.println("*****************");

        constructors student2 = new constructors();
        student2.displayDetails();



    }
}

