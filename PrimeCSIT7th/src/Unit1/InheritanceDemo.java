package Unit1;
//Its the property bu which one class acquire properties of another class
class Person{
    private String name;
    private String gender;
    private String phone;
   //Constructor
    public Person(String name,String gender,String phone){
        this.name = name;
        this.gender=gender;
        this.phone= phone;
    }
    //method
    public void displayPerson(){
        System.out.println("Name is: "+this.name);
        System.out.println("Gender is: "+this.gender);
        System.out.println("Phone is: "+this.phone);
    }
}
class Student extends Person{
    private int roll;
    private String faculty;
    private String grade;
    //To call constructor of parent class super keywird is used
    public Student(int roll,String faculty,String grade,String name,String gender,String phone){
        //calling constructor of super class
        super(name,gender,phone);
        this.roll=roll;
        this.faculty = faculty;
        this.grade = grade;
    }
    public void displayStudent(){
        System.out.println("Roll is: "+this.roll);
        System.out.println("Faculty is: "+this.faculty);
        System.out.println("Grade is: "+this.grade);
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        Student s1 = new Student(5,"Csit","A","sanis","male","9856784524");
        s1.displayPerson();
        s1.displayStudent();
        
    }
    
}
