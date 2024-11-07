package Pyramid;

public class Square_pattern2
{

	public static void main(String[] args) 
	{

				for(int i=1;i<=9;i++)
				{
					for(int j=1;j<=9;j++)
					{
						if(i==1 || i==9 || j==1 || j==9)
						{
							System.out.print("1");
						}
						else if(i==2 || i==8 || j==2 || j==8)
						{
							System.out.print("2");
						}
						else if(i==3 || i==7 || j==3 || j==7)
						{
							System.out.print("3");
						}
						else if(i==4 || i==6 || j==4 || j==6)
						{
							System.out.print("4");
						}
						else
						{
							System.out.print("5");
						}
					}
					System.out.println();
				}
			

	}

}
