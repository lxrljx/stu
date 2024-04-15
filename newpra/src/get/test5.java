package get;

import java.util.Scanner;

public class test5 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.next();
		String str=new StringBuilder(a).reverse().toString();
		if(a.compareToIgnoreCase(str)==0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
