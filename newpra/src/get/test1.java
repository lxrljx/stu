package get;
//预测3
import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.next();
		char[] na=a.toCharArray();
		String b=s.next();
		char[] nb=b.toCharArray();
		int c=s.nextInt();
		for(int i=0;i<na.length;i++) {
			int flag=1;
			for(int j=0;j<nb.length;j++) {
				if(na[i+j]!=nb[j]) {
					flag=0;
				}
			}
			c-=flag;
			if(c==0) {
				System.out.println(i+1);
				break;
			}
		}
		
	}

}
