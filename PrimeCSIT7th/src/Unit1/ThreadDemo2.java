package Unit1;

class Calculation4 extends Thread{
        @Override
    public void run(){
        for(int i=1;i<=50;i++){
            System.out.println("Calculation 4");
            System.out.println(i);
            try{
                Thread.sleep(500);//0.5sec delay
            }catch(InterruptedException b){
                System.out.println(b);
            }
        }
        
    }
}
class Calculation5 extends Thread{
        @Override
    public void run(){
        for(int i=100;i<=200;i++){
            System.out.println("Calculation 5");
            System.out.println(i);
            try{
                Thread.sleep(1000);//0.5sec delay
            }catch(InterruptedException b){
                System.out.println(b);
            }
        }
        
    }
}
public class ThreadDemo2 {
    public static void main(String[] args) {
        Calculation4 c4 = new Calculation4();
        Calculation5 c5 = new Calculation5();
        Thread t1 = new Thread(c4);
        Thread t2 = new Thread(c5);
        t1.start();
        t2.start();
    }
    
}
