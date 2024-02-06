package z;

class Sum{
    
    public int add(int a, int b) {
        return a + b;
    }
    
    public int add(int a, int b,int c){
        return a+b+c;
    }
}
public class Practical1_Q4 {

    public static void main(String[] args) {
        Sum s = new Sum();
        int s1 = s.add(5,10);
        int s2 = s.add(5,10,15);
        System.out.println("Sum of two integers: " + s1);
        System.out.println("Sum of three integers: " + s2);
    }
}
