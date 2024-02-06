package Unit1;
//creating own lass
class Box{
//instance variable
    private int length;
    private int breadth;
    private int height;
//    constructor: used to set value of instancec variable
    public Box(int length,int breadth, int height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
//    method: used to give some services
    public void displayBox(){
        System.out.println("length is: "+ this.length);
        System.out.println("breadth is: "+this.breadth);
        System.out.println("height is: "+this.height);
    }
//    method that returns value
    public int calcVolume(){
        return(this.length*this.breadth*this.height);
    }
}

public class ClassConceptDemo2 {
    public static void main(String[] args) {
//        creating objecct of box
        Box b1 = new Box(50,60,40);
//        calling metod
        b1.displayBox();
        int vol = b1.calcVolume();
        System.out.println("The Volume is:: "+ vol);
        Box b2 = new Box(10,10,10);
        b2.displayBox();
        int vol1=b2.calcVolume();
        System.out.println("The Volume of arko object create gare pachi is: "+vol1);
        
    }
    
}
