
/**
 * Write a description of class Student here.
 *
 * @author (Masoud Hamad)
 * @version (07.01.2026)
 */
/*
 * class, className; public?? private?? protected?? default??? => access specifier
*/
public class Student{
    //atrtributes and methods
    private String name;
    private String regnumber;
    private int age;
    
    //special methods - initialize object - Constructor
    //implicity or expilicity 
    public Student(String name,String regNumber,int age){
        this.name=name;
        regnumber=regNumber;
        this.age=age;
    }
    //behaviours(methods)
    public void study()
    {
        System.out.println(name + " where his regNumber is "+regnumber+" and his age is "+age+"  is studying ...");
    }
    
    public static void main(String[] args)
    {
        //object
        Student std1=new Student("Lukman","24BIA001",18);
        std1.study();
        
    }
}