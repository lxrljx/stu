package get;

import java.util.Scanner;

//值得质疑的是！！next（） nextline()

public class test15 {
	static int max1;
	static int min1;
    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int nna=Integer.toString(a).length();
		
		int b=s.nextInt();
		int nnb=Integer.toString(b).length();
		
		int c=s.nextInt();
		int nnc=Integer.toString(c).length();
		int d=s.nextInt();
		int nnd=Integer.toString(d).length();
		double p=(nna+nnb+nnc+nnd)/4.00;
		int[] len= {nna,nnb,nnc,nnd};
		
		int max=0;
		int min=100000;
		for(int i=0;i<4;i++) {
			if(len[i]>max) {
				max=len[i];
				max1=i;
			}
			if(len[i]<min) {
				min=len[i];
				min1=i;
			}
		}
		

		
		if(nna>p&&nnb>p&&nnc>p) {
			duiying(min1);
		}
		else if(nna>p&&nnb>p&&nnd>p) {
			duiying(min1);
		}
		else if(nna>p&&nnd>p&&nnc>p) {
			duiying(min1);
		}
		else if(nnd>p&&nnb>p&&nnc>p) {
			duiying(min1);
		}
		else if(nna<p&&nnb<p&&nnc<p) {
			duiying(max1);
		}
		else if(nna<p&&nnb<p&&nnd<p) {
			duiying(max1);
		}
		else if(nna<p&&nnd<p&&nnc<p) {
			duiying(max1);
		}
		else if(nnd<p&&nnb<p&&nnc<p) {
			duiying(max1);
		}
		else if(nna==nnb&&nnc==nnd&&nna==nnc) {
			System.out.println("B");
		}else {
			System.out.println("C");
		}		
		
		
		
		
		
}

	public static void duiying(int i) {
		if(i==0) {
			System.out.println("A");
		}
		if(i==1) {
			System.out.println("B");
		}
		if(i==2) {
			System.out.println("C");
		}
		if(i==3) {
			System.out.println("D");
		}
		
	}
}
        