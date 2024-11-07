class calculation{
    public static int addition(int num1, int num2){
        return num1 + num2;
    }  
    // by changing the arguments
    public static int addition(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
    public static float addition(float num1, int num2){
        return num1 + num2;
    }
    // by changing the datatype
    public static double addition(int num1, float num2){
        return num1 + num2;
    }
}
public class methodoverloading {
    public static void main(String[] args) {
        System.out.println(calculation.addition(23,45));
        System.out.println(calculation.addition(34,46,68));
        System.out.println(calculation.addition(23.5f,234));
        System.out.println(calculation.addition(243,24.4f));
    }
}
