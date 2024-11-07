package Pyramid;

public class Diamond_pattern_number {


			public static void main(String[] args) 
			{
				int a=1;
				int b=6;
				
				for(int r=1;r<=6;r++)
				{
					for(int s=6;s>=r;s--)
					{
						System.out.print(" ");
					}
					for(int c=1;c<=r;c++)
					{
						System.out.print(a+" ");
					}
					a=a+1;
					System.out.println();
				}
				
				
				for(int r=1;r<=6;r++)
				{
					for(int s=1;s<=r;s++)
					{
						System.out.print(" ");
					}
					for(int c=6;c>=r;c--)
					{
						System.out.print(b+" ");
					}		
					b=b-1;

					System.out.println();
				}
					
			}

}
