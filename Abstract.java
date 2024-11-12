abstract class Animal {
    public abstract void animalsound();
    public void sleep(){
        System.out.println("Zzzz");
    }
}

class pig extends Animal {
    public void animalsound() {
        System.out.println("the pig says : we weee");
    }
}

public class Abstract {
    public static void main(String []args){
        pig Pig = new pig();
        Pig.animalsound();
        Pig.sleep();

    }
}
