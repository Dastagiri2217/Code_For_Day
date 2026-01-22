//check given number is even or odd
/*
1.check using modulo operator
2.check with out using modulo operator
3.check using switch case
*/
import java.util.*;
class EvenOrOdd{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//using % operator
		/*
		if(n%2==0){
			System.out.println("Even");
			return;
		}
		System.out.println("Odd");
		
		//without using % operator
		if((n&1)==0){ //or use divide-mulitply by 2 and compare theorm
			System.out.println("Even");
		}
		else{
			System.out.println("Odd");
		}
		*/
		//using switch
		switch(n%2){
			case 0: System.out.println("Even");
			        break;
			case 1:System.out.println("Odd");
			        break;
	    }
	}
}