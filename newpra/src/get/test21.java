package get;

import java.util.Scanner;


//输出！！二维数组的输出！
public class test21 {
	static int a;
	static  int b;
	static int[][] c;
    public static void main(String[] args) {
    	long start=System.currentTimeMillis();
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
	    c=new int[a][b];
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				c[i][j]=s.nextInt();
				}
		}
		
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				if(c[i][j]==1) {
					for(int k=0;k<a;k++) {
						if( c[k][j]!=1) { c[k][j]=0;}
						  
				}
					for(int k=0;k<b;k++) {
						if( c[i][k]!=1) { c[i][k]=0;}

				}
					c[i][j]=0;
		  }
				}
	}
		 for(int i=0;i<a;i++) {
	 			for(int j=0;j<b-1;j++) {
	 			    	   System.out.print(c[i][j]+" ");	
	 				}
	 			System.out.println(c[i][b-1]);
	 			//System.out.println();
	 			}
		 long end=System.currentTimeMillis();
		 System.out.println(end-start);
   
	}
}
