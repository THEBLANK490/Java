package Unit1;
//Its object cannot be created. It can have instance variable, constructor 
//,normal method. It can have abstract method: such method that doesnot have 
//implementatoin part and are only declared
//normal class have to inherit abstract class and should provide implementation 
//of abstract method, abstract class and method are 
abstract class Calculation{
    //instance variable
    private int x;
    private int y;
    
    //constructor
    public Calculation(int x,int y){
        this.x=x;
        this.y=y;
    }
    //normal method
    public void calcSum(){
        System.out.println("SUm is "+(this.x+this.y));
    }
    //abstract method
    public abstract void calcDiff(int x1,int x2);
    public abstract int calcMulti(int x1,int x2);
}

class Solution extends Calculation{
    private final int x2;
    private final int y2;
    public Solution(int x2,int y2,int x, int y){
        super(x,y);
        this.x2 = x2;
        this.y2 = y2;
    }
    //normal method
    public void calcDiv(){
        System.out.println("Division is: "+(x2/y2));
    }
    @Override
    //overriding abstract method
    public void calcDiff(int x1, int y1){
        System.out.println("Difference is: "+(x1-y1));
    }
    @Override
    public int calcMulti(int x1,int y1){
        return(x1*y1);
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        Solution s1 = new Solution(50,40,30,20);
        s1.calcSum();//method of calculation
        s1.calcDiv();//method of sultion
        s1.calcDiff(30,10);//abstract method
        int mul1 = s1.calcMulti(10,20);//abstract method
        System.out.println("Multiplication is "+mul1);
        //using reference of abstract class (Class ko variable lai reference bhancha)
        Calculation c1;
        c1 = s1;//Dynamic method dispatch
        c1.calcSum();
        c1.calcDiff(20, 10);
        int mul = c1.calcMulti(12, 12);
        System.out.println("Multiplication is "+mul);
    }
    
}
