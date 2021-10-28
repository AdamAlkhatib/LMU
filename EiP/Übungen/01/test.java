import java.util.*;
public class test {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        		System.out.print("Enter any number to be the value of n: ");

		int n = sc.nextInt();
		System.out.println("user chose number " + n + " to be the value of n");

		int x;
		x = 0;
		System.out.println("Var x ist gleich" + " " + x);
		
		for (int i = 1; i <= n;) {
		if ( (i & 1) == 0 ) { 
			System.out.println( "i has the value of " + i + "  which is even" );
			System.out.println("Var x bliect gleich" + " " + x);
			i++; }
 
				else {  System.out.println( "i has the value of " + i + "  which is odd" );
					x = x + i;
					System.out.println("Var x ist jetzt gleich" + " " + x);
					i++; }
		}
		
		System.out.println("Das summe alle ungerade Zahlen <= " + n + " ist " + x + ".");		

	}
}
