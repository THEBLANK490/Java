package Unit1;

//In inheritance if super classs and sub class have 
//methods with same name and same signature (return type and parameters).
//to cal overridden method of superclass, super keyword shoud be used 
//Dynamic Polymorphism
class Calculation{
    public void calc1(){
        System.out.println("This is calc1 of superclass");
    }
    public void calc2(int x,int y){
        System.out.println("Sum is: "+ (x+y));
    }
}
class Solution extends Calculation{
    @Override
    public void calc1(){
        super.calc1();//calls Calc1 of parent calculation
        System.out.println("This is Calc1 of subclass.");
    }
    @Override
    public void calc2(int x,int y){
        super.calc2(x, y);
        System.out.println("Difference is: "+ (x-y));
    }
    
}
public class MehodOverriddingDemo {
    public static void main(String[] args) {
        Solution s1 = new Solution();
        s1.calc1();
        s1.calc2(40,30);
    
    }
}
