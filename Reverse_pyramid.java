package Pyramid;

public class Reverse_pyramid 
{

	public static void main(String[] args) 
	{
		
				for(int r=1;r<=6;r++)
				{
					for(int s=1;s<=r;s++)
					{
						System.out.print(" ");
					}
					for(int c=6;c>=r;c--)
					{
						System.out.print(" *");
					}		
					System.out.println();
				}
			


	}

}
