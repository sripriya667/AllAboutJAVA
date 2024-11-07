class one{
    public void ek(){
        System.out.println('1');
    }
}
// single inheritance
class two extends one{
    public void dho(){
        System.out.println('2');
    }
}
// multilevel inheritance
class three extends two{
    public void theen(){
        System.out.println('3');
    }
}
// heirarchial inheritance -> class two is super class for class four and class three
class four extends two{
    public void chaar(){
        System.out.println('4');
    }
}
public class inheritance {
    public static void main(String[] args) {
        four g = new four();
        g.ek();
        g.dho();
        g.chaar();
    }
}
