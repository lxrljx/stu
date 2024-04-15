package get;

import java.util.Scanner;



public class test23 {
	static int a;
	static int b;
	static int c;
    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		int m=0;
		int n=0;
	
		if(a%c==0) {
			m=a/c;
		}else {m=a/c+1;}
		if(b%c==0) {
			n=b/c;
		}else {n=b/c+1;}
		System.out.println(m*n);
		
		
}}
