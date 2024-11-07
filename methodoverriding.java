class person{
    String name;
    int age;
    public person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void print(){
         System.out.println("Name :" + this.name);
         System.out.println("Age :" + this.age);
    }
    }
    class employee extends person {
        String designation;
        float salary;
        public employee (String name, int age, String designation, float salary){
        super(name,age);
        this.designation=designation;
        this.salary = salary;
        }

    public void print(){
        super.print();
        System.out.println("Designation :" + designation);
        System.out.println("Salary :" + salary);
    }
}
public class methodoverriding {
    public static void main(String[] args) {
        employee Employee = new employee("priya" , 20 , "java developer" , 180000);
        Employee.print();
    }
    
}
