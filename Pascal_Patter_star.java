package Pyramid;

public class Pascal_Patter_star 
{

	public static void main(String[] args) 
	{

		for(int r=1;r<=4;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int r=1;r<=4;r++)
		{
			for(int c=4;c>=r;c--)
			{
				System.out.print("*");
			}
			System.out.println();
		}	
		
	}

}
