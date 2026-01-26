
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class Person
{
    protected String name;
    protected int age;
    
    public Person(String name, int age)
    {
        this.name=name;
        this.age=age;
        System.out.println("Person constructor called");
    }
    public void introduce()
    {
        System.out.println("Hi, I am "+name+" and I am "+age+" years old.");
    }
    public void sleep(){
        System.out.println(name + " is sleeping...");
    }
}

class Student extends Person{
    private String studentId;
    private String major;
    
    public Student(String name,int age,String studentId,String major)
    {
        super(name,age);
        this.studentId=studentId;
        this.major=major;
        System.out.println("Student Constructor is called");
    }
    public void study()
    {
        System.out.println(name +" is studying "+major);
    }
    
    @Override
    public void introduce()
    {
        super.introduce();
        System.out.println("I am student with ID: "+studentId);
        System.out.println("My major is: "+major);
    }
    public String getStudentId()
    {
        return studentId;
    }
    public String getMajor()
    {
        return major;
    }
}


public class InheritanceTest{
    public static void main(String [] args)
    {
        Person p = new Person("Ali Hassan",30);
        p.introduce();
        p.sleep();
        
        Student st = new Student("Fatma Issa",20,"PT821","BIA");
        st.introduce();
        st.study();
        st.sleep();
        
    }
}


