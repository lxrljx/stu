package get;

import java.util.Scanner;

public class test13 {
	static double k=0.00;
	static int f;
    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		for(int i=1;;i++) {
			k=k+1.00/i;//1.00
			if(k>a) {
				f=i;
				break;//for!!!
			}

		}
		System.out.println(f);
	}
}
