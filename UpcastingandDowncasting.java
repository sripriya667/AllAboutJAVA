class vehicle{
    public void drive(){
        System.out.println("vehicle is driving..");
    }
}
class car extends vehicle{
    public void drive(){
        System.out.println("car is driving..");
    }
    public void speedup(){
        System.out.println("car is speeding up..");
    }
}
public class UpcastingandDowncasting {
    public static void main(String[] args) {

        // upcastiing -> converting the type from child class to parent class

        vehicle Vehicle1 = new car();
        Vehicle1.drive();

        // downcasting -> converting the type from parent class to child class
        //  a parent class reference object is given to child class
        vehicle Vehicle = new car();
        car Car = (car)Vehicle;
        Car.drive();
        Car.speedup();

    }
}
