import java.util.Scanner;

  class Account 

{ 
    private String Holdersname;
    private float balance;
	
    
    public Account() 
    {
  
     } 

    public Account(String t, float f ) 
   {
    Holdersname=t ;
    balance =f;
    }

   public void Display() 
   {
   System.out.printf( " Account Holdersname is  %s and its balance is %.2f \n",Holdersname , balance );
    }

   public float Credit()
    {   Scanner sc = new Scanner(System.in) ;
       System.out.println(" Enter the credit amount : ");
      float bal =sc.nextFloat();
       balance = balance + bal;
      return balance;
    }

}





 public class AccountTest 

{
 	
	public static void main (String [] args) 
     
      {   

	  System.out.println( "  WELCOME IN BANK OF CENTRAL " ) ;
          System.out.println(" --------------------------------*----------------------------");
	  Scanner sc = new Scanner(System.in) ;
	  
	  Account a1 = new Account("Rahul", 47000) ;
          Account a2 = new Account("Surbhi", 50000) ;

        System.out.println("  Inital Account a1 Details");
        a1.Display();

        System.out.println(" " );

	System.out.println(" Inital Account a2 Details");
        a2.Display();

         System.out.println(" " );
   
        System.out.println(" Do you want to credit Some amount in a1 account : 1 (Yes)/ 0 (No)") ;
        int a = sc.nextInt();
 	if ( a == 1 )
          {a1.Credit();}
         else  if (a == 1) 
          {System.out.println(" ---------Good Day Sir----------" );}

        
        System.out.println(" Do you want to credit Some amount in a2 account : 1 (Yes)  / 0 (No)  ") ;
        int b = sc.nextInt();
         if ( b == 1 )
         { a2.Credit();}
         else if ( b == 0) 
        {  System.out.println("-------------Good Day Sir---------------" );}

         System.out.println(" " );
        
 
	System.out.println("  Final Account a1 Details");
        a1.Display();

	System.out.println("  Final Account a2 Details");
        a2.Display();


          
          
      }

}







