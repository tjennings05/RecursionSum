import java.util.Scanner;

public class Recurse
{
  public static void main(String[] args)
  {
	int[] A = new int[6];
	System.out.println("Enter five No.s:");
	for(int i = 1; i <= 5; i++)
	{
		Scanner scan = new Scanner(System.in);
		A[i] = scan.nextInt();
	}
	int result = sum(A, 6);
    System.out.println("Result: " + result);
  }
  public static int sum(int [] A, int k)// the recursive method
  {
    if (k > 0)
	{
      return ( A[k - 1] + sum(A, k - 1));
    } 
	else
	{
      return 0;
    }
  }
}