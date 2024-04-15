package get;

import java.util.Scanner;

public class test10 {
    static int a;
    static int re=0;
	 public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		int[]b=new int[a];
		for(int i=0;i<a;i++) {
			b[i]=s.nextInt();
		}
		int c=s.nextInt();
		for(int i=0;i<a;i++) {
			if(b[i]<=c+30) {
				re+=1;
			}
		}
		System.out.println(re);
		if(re==a) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		
		
	 }
}
