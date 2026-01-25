import java.util.*;
class FindPower{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int org = num;
		System.out.println("Enter power: ");
		int pow = sc.nextInt();
		if(pow<0) pow = -1*pow;
		int m = pow;
		int ans = 1;
		while(pow>0){ //t.c O(log n)
		   if(pow%2==1){
			   ans *= num;
			   pow = pow -1;
		   }
		   else{
			   pow = pow /2;
			   num = num * num;
		    }
		}
		if(m<0) ans = 1/ans;
		System.out.println("Power of "+org+" is "+ans);
    }
}	