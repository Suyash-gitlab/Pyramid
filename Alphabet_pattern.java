package Pyramid;

public class Alphabet_pattern {

			public static void main(String[] args) 
			{
				char a='G';
				char b='C';

				for(int r=1;r<=4;r++)
				{
					for(int s=4;s>=r;s--)
					{
						System.out.print(" ");
					}
					for(int c=1;c<=r;c++)
					{
						System.out.print(a+" ");
					}
					a-=2;
					System.out.println();
				}
				
				for(int r=1;r<=3;r++)
				{
					for(int s=1;s<=r;s++)
					{
						System.out.print(" ");
					}
					for(int c=3;c>=r;c--)
					{
						System.out.print(" "+b);
					}		
					b+=2;
					System.out.println();
				}
			}

		}

	
