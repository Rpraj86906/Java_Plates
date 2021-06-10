public class Student 
{
     private String name ;
     private int rollno ;

     public void setData (String n, int r ) 
   { 
       name =n;
       rollno=r;
    }
    
    public String getName ()
   {
    return name;
   }

    public int getRollno()
   {
    return rollno;
    }

   public void display() 
   {
   System.out.printf(" My name is %s and my rollno is %d \n " , name , rollno);
   }

}

   
    