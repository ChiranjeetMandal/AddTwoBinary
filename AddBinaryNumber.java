import java.util.Scanner;
class AddBinaryNumber 
{
	public static void main(String[] args) 
	{
		int i=0,carry=0;
		Scanner scan =  new Scanner(System.in);
		System.out.println("Enter first binary number ");
		long b1 = scan.nextLong();
		System.out.println("Enter second binary number ");
		long b2 = scan.nextLong();

		int[] sum = new int[10];

		while(b1!=0||b2!=0)
		{
			sum[i]= (int)((b1%10+b2%10+carry)%2);
			carry = (int)((b1%10+b2%10+carry)/2);
			b1=b1/10;
			b2=b2/10;
			i++;
		}
		if(carry!=0)
		{
			sum[i]=carry;

		}
		
		System.out.println("Output");
		while(i>=0)
		{
			System.out.print(sum[i]);
			i--;

		}
			System.out.println("\n");

	}
}
