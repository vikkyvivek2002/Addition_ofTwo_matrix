import java.util.*;
public class Addition_ofTwo_matrix
 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no of row and col for 'a' :");
		int r1 = s.nextInt();
		int c1 = s.nextInt();
		
        int a[][] =  new int[r1][c1];
        System.out.println("Enter the 'a' values of "+r1+" " +c1 );
        for(int i =0 ; i<r1 ; i++)
        {
        	for(int j= 0; j<c1 ;j++)
        	{
        		a[i][j] = s.nextInt();
        	}
        }
        //first matrix is completed
        
        System.out.println("Enter no of row and col for 'a' :");
		int r2 = s.nextInt();
		int c2 = s.nextInt();
		
        int b[][] =  new int[r2][c2];
        System.out.println("Enter the 'b' values of "+r2+" " +c2 );
        for(int i =0 ; i<r2 ; i++)
        {
        	for(int j= 0; j<c2 ;j++)
        	{
        		b[i][j] = s.nextInt();
        	}
        }
        // second matrix is completed 
         
        s.close();
        
        System.out.println("The addition of two matrix is : ");
        for(int i =0 ; i<r1 && i<r2 ; i++)
        {
        	for(int j= 0; j<c1 && j<c2 ;j++)
        	{
        	  System.out.print((a[i][j]+b[i][j]) +"\t");
        	}
        	System.out.println();
        }	

	}

}
