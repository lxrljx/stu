package get;
//进制转换
import java.util.Scanner;

public class test6 {
	static int  nc = 0;
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int[][] b=new int[a][2];
		for(int i=0;i<a;i++) {
			for(int j=0;j<2;j++) {
				b[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<a;i++) {
			int c=b[i][0];
			int d=b[i][1];
			result( c, d);
		}
		
		
	}

	private static void result(int c, int d) {
		StringBuilder re=new StringBuilder();
		if(c<0) {
		nc=Math.abs(c);
		}else {
			nc=c;
		}
		//System.out.println(nc);
		do {
			int r=nc%d;
			if(r>=0&&r<=9) {
				//String str=Integer.toString(r);
				re.append(r);
				//System.out.println(re);
			}else if(r==10) {
				re.append("A");
			}else if(r==11) {
				re.append("B");
			}else if(r==12) {
				re.append("C");
			}else if(r==13) {
				re.append("D");
			}else if(r==14) {
				re.append("E");
			}else if(r==15) {
				re.append("F");
			}
		    nc/=d;
		}while(nc!=0);
		if(c<0) {
			re.append("-");
		}
		
		System.out.println(re.reverse());
	}
	
}
