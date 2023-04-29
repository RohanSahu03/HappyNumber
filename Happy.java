import java.util.Scanner;

public class Happy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter number : ");
		
		int n= sc.nextInt();
		
		while(n>9) {
			int sum=0;
			do {
				int d =n%10;
				sum=sum+d*d;
				n=n/10;
				
			}while(n!=0);
			n=sum;
		}
		if(n==1 || n==7) {
			System.out.println("its a happy number");
		}
		else {
			System.out.println("not a happy number");
		}
		

	}

}
