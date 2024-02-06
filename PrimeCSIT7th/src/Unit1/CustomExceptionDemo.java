//To create own error (exception) we have to use superclass Exception
//Step 1: Create error class by extending superclass Exception
//Step 2: Use override method toString() to return error message
//Step 3: Use throw to explicitly throw own error
//Stpe 4: Use throws if error is generated from method
//Step 5: Use try catch to handle error thrown from method
package Unit1;

class NegativeAreaException extends Exception{
    @Override
    public String toString(){
        return "Area Cannot be negative. ";
    }
}

class Rectangle{
    public void calcArea(int length, int breadth)throws NegativeAreaException{
        if(length < 0 || breadth < 0){
            throw new NegativeAreaException();
        }else{
            System.out.println("Area is: "+(length*breadth));
        }
    }
}
class CustomExceptionDemo {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        try{
            r1.calcArea(-20,30);
        }catch(NegativeAreaException n){
            System.out.println(n);
        }
        System.out.println("Out of catch Block..");
    }
    
}
