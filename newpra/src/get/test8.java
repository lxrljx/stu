package get;

import java.util.Scanner;

public class test8 {
	 public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int result=fun(a);
		System.out.println(result);
		
	}

	private static int fun(int a) {
		if(a==0) {
			return 0;
		}else if(a==1) {
			return 1;
		}else {
			return fun(a-1)+fun(a-2);
		}
		
		
	}
}
