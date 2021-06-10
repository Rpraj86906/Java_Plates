import java.util.Scanner;

class Array2D
{
	public static void main(String arg[])
	{
		int[][] array = new int[10][10];
		int[] p = new int[10];
		int k=1;
		int m=0;
		int n=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Zig-Zag array of prime number  \n");
      
		while(k<=100)
		{
			for(int i=k;i<(k+10);i++)
			{
				int count=0;
				for(int j=1;j<=i;j++)
				{
					if(i%j==0)
					{
						count++; 
					}
				}
				if(count==2)
				{
					array[m][n]=i;
					n++;
				}
			}
		k+=10;
		m++;
		n=0;
		}


		for(int i=0; i<10;i++)
		{
			for(int j=0; j<10;j++)
			{
				if(array[i][j]!=0)
				System.out.print(array[i][j] + " ");
			}
			System.out.print("\n");
		}
		
		System.out.println("\n 2-d array of prime numbers are printed above.");
		

	}
}