import java.util.Scanner;
 public class StudentTest
 {
    
 	public static void main ( String [] args ) 
	{
                Scanner sc = new Scanner(System.in) ;
  		Student st = new Student();

 		System.out.printf(" Initial name is %s and roll no is %d \n " , st.getName(), st.getRollno());
 		System.out.println(" Enter teh name and roll no : " );
		
		String stname = sc.next();
		int strollno = sc.nextInt();
		
		st.setData(stname, strollno) ;
		System.out.println( );
		st.display();
	}
}