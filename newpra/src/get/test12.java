package get;

import java.util.Scanner;

public class test12 {
	static int a;
    
	 public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		int z=0;
		int h=0;
		//求质数
		if(a==1) {
			z=2;
			h=4;
		}else {
			//求质数
		for(int i=a+1;;i++) {
			if(sushu(i)==0) {
				z=i;
				//System.out.println(z);
				break;
			}
		}
		//求和数
		if(a%2==1) {
			h=a+1;
		}else {
			if(sushu(a+1)==1) {h=a+1;
			}else {
				h=a+2;
			}
			
			
		}
		
		}
		
		
		//System.out.println(z);
		//System.out.println(h);
		System.out.println(z+h);
		

		
	 }
	 public static int sushu(int i) {
		 int flag=0;//是素数
			for(int j=2;j<=Math.sqrt(i);j++) {
				if(i%j==0) {
					//不是素数
					flag=1;
				}
			}
			return flag;
		
	    	  
	      }
}
