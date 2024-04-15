package get;

import java.util.Scanner;

public class test9 {static int a;
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	a=s.nextInt();
	int[] b=new int[a];
	for(int i=0;i<a;i++) {
		b[i]=s.nextInt();
	}
	int r1=max(b);
	int r2=max(b);
	int r3=max(b);
	System.out.println(r1+r2+r3);
}

private static int max(int[] b) {
   int re=0;
   for(int i=0;i<a;i++) {
		if(b[i]>re) {
			re=b[i];
		}
	}
   for(int i=0;i<a;i++) {
		if(b[i]==re) {
			b[i]=0;
			break;//一定要注意！！
			//是想循环到最后,还是有想要的结果就停
		}
	}
   
	return re;
}

}
