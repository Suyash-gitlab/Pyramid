package Pyramid;

import java.util.Scanner;

public class Pascal_right_angle {

	public static void main(String[] args) 
	{
		int r,c;
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows ");
        int n = sc.nextInt();

        for(r=1;r<=n;r++)
        {
            for(c=1;c<=r;c++)
            {
                System.out.print("*");
            } System.out.println();
        } 

        for(r=1;r<=n;r++)
        {
            for(c=n-1;c>=r;c--)
            {
                System.out.print("*");
            } 
            System.out.println();
        } 

	}

}
