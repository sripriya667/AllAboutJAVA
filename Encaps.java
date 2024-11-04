class Person{

    private String name;
    private int age;

    // get method is used to read the data
    public String getName()
    {
        return name;
    }
    // set method is used to write the data
    public void setName(String name)
    {
        this.name = name;
    }
    
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
}


public class Encaps{
    
    public static void main(String args[]){

        Person person = new Person();;
        person.setName("jhon");
        System.out.println("Name:" + person.getName());
        person.setAge(30);
        System.out.println("Age:" + person.getAge());
    }
}