//Create a parent class Teachers
class Teachers
{
    //Declare the instance variable
    protected String name;
    protected String email;

    //create Method of Teacher class
    public void working()
    {
        System.out.println("Teaching");
    }
}

//create a child class MathsTeacher which inherit the Teacher class
class MathsTeacher extends  Teachers
{
    //create a method of child class
    public void displayinfo()
    {
        System.out.println("My name is "+name);
        System.out.println("Email is " +email);
    }
}

public class Main {
    public static void main(String[] args) {
        //create an object of child class
        MathsTeacher obj=new MathsTeacher();
        //calling the method of parent class with object of child class
        obj.working();
        obj.name = "Sandeep Jain";
        obj.email = "Sandeep2000@gmail.cpm";
        //calling the method of child class
        obj.displayinfo();

    }
}