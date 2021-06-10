import java.util.Scanner;

 class Person
{
    String name ;
    int age ;
   public void setData(String n, int a)
   {
      name=n;
      age=a;
   }
   void display()
    {
        System.out.println(name);
        System.out.println(age);
    }
  
}


public class PersonTest
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      Person pa = new Person();
      Person pb = new Person();
      System.out.println("Enter the name and Age of first person");
      String paname = input.next();
      int paage = input.nextInt();
      pa.setData(paname,paage);
      System.out.println("Enter the name and Age of Second person");
      String pbname = input.next();
      int pbage = input.nextInt();
      pb.setData(pbname,pbage);
      System.out.println();
      pa.display();
      pb.display();
     if(pa.age>pa.age)
        {
            System.out.println("The elder person is "+pa.name+" with age "+pa.age+".");
        }
        else
        {
            System.out.println("The elder person is "+pb.name+" with age "+pb.age+".");
        }
        
    }
}