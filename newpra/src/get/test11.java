package get;

import java.util.Scanner;

public class test11 {
	static int a;
    
	 public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		int k=0;
		for(int i=1;i<=10000;i++) {
			for(int j=1;j<=i;j++) {
				k+=i;
				a-=1;
				if(a==0) {
					break;
				}
			}
			if(a==0) {
				break;
			}
		}
		System.out.println(k);
		
		
		
		
	 }
}
