package comm.example;

public class Person {

    //instance variables
    private   int personId;
    private String personName;
    private int personAge;

    public void createPerson(int id,String name,int age)
    {
        if((age<0)||(age>100))
        {
            System.out.println("invalid age");
            personAge=0;
        }
        else
        {
         personAge=age;
        }

        personId=id;
        personName=name;
    }

    public String getDetails()
    {
        return "Person ID: "+personId + " Person Name: "+personName+" Person Age: "+personAge;
    }

}
