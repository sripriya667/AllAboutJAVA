interface animal {
    public void animalsound();
    public void sleep();
} 

class pig implements animal{
    public void animalsound() {
        System.out.println("the pig says : wee weee");
    }
    public void sleep() {
        System.out.println("Zzzz");
    }
 
}
public class Interface {
    public static void main(String[] args) {
        pig Pig = new pig();
        Pig.animalsound();
        Pig.sleep();
    }
}
