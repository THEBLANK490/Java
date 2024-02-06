package Unit1;

// using multithreading, a single program can do multiole work at a same time
// In java multithreading can be acheived using two ways
// implement Runnable interface
// inheriting (extends) Thread class


class Calculation2 extends Thread{
    @Override
    public void run(){
        for(int i=1;i<=50;i++){
            System.out.println("Calculation 1");
            if(i%2 == 0){
                System.out.println(i);
                try{
                    Thread.sleep(1000);
                    
                }catch(InterruptedException e){
                    System.out.println(e);
                }
            }
        }
        
                for(int i=1;i<=50;i++){
                    System.out.println("Calculation 2");
            if(i%2 != 0){
                System.out.println(i);
                try{
                    Thread.sleep(1000);
                    
                }catch(InterruptedException j){
                    System.out.println(j);
                }
            }
        }
        
    }
}

class Calculation3 extends Thread{
        @Override
    public void run(){
        for(int i=1;i<=50;i++){
            System.out.println("Calculation 3");
            System.out.println(i);
            try{
                Thread.sleep(500);//0.5sec delay
            }catch(InterruptedException b){
                System.out.println(b);
            }
        }
        
    }
}

public class ThreadDemo1 {
    public static void main(String[] args) {
        Calculation2 c2 = new Calculation2();
        c2.start();
        Calculation3 c3 = new Calculation3();
        c3.start();
        
        
    }
    
}
