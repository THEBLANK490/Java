package Unit1;
//It is like a abstract class but differencec is that it contains list of abstract method only, instance variable are declared as constant(final) it doesnot have any constructor and normal method. It's object canot be created
//it is declared using interface keyword and access through implement keyword
interface Calculations1{
    //list of abstract method 
    void sum(int x, int y);
    int diff(int x,int y);
    void div(int x,int y);
}

class Solutions1 implements Calculations1{

    @Override
    public void sum(int x, int y) {
        System.out.println("Sum is: "+(x+y));
    }

    @Override
    public int diff(int x, int y) {
        return(x-y);
    }

    @Override
    public void div(int x, int y) {
        System.out.println("Div is: "+(x/y));
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Solutions1 s1 = new Solutions1();
        s1.sum(5, 10);
        int diff = s1.diff(10,5);
        System.out.println("Difference is: "+diff);
        s1.div(20,10);
        //using interface references
        Calculations1 c1;
        c1=s1;
        c1.sum(100,200);
        int diff1 = c1.diff(200, 10);
        System.out.println("Diff is: "+ diff1);
        c1.div(300, 5);
        
    }
    
}
