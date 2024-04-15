package get;

import java.util.Scanner;

 public class test16 {
	 
	    static int map[][];		
	    static int m;
		static int n;
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		 m=s.nextInt();
		 n=s.nextInt();
		 map=new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				map[i][j]=s.nextInt();
			}}
		int k=0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
					if(i!=0&&j!=0&&i!=m-1&&j!=n-1) {
						if(map[i][j]==1&&map[i-1][j]==0&&map[i+1][j]==0&&map[i][j-1]==0&&map[i][j+1]==0) {
							k++;
						}
					}				
			}}
		System.out.println(k);
		
		
}}
