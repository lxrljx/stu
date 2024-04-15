package get;
//第二题 求最值
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		while(s.hasNext()) {
		    int max=-1;
			int min=101;
			int a=s.nextInt();
			int[] b=new int[a];
			for(int i=0;i<a;i++) {
				b[i]=s.nextInt();
				//System.out.println(b[i]);
				if(b[i]>max) {
					max=b[i];
				}
				if(b[i]<min) {
					min=b[i];
				}
				
			}
			System.out.println(max+" "+min);
		}

	}}
