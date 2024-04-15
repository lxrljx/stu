package get;
//最大公约数 最小公倍数
import java.util.Scanner;

public class test7 {
    static int max=0;
    static int min=0;
	 public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		if(a<b) {
			int c;
			c=a;
			a=b;
			b=c;
		}
		for(int i=1;i<=b;i++) {
			if(a%i==0&&b%i==0) {
				min=i;
			}
			
		}
		for(int i=a;;i++) {
			if(i%a==0&&i%b==0) {
				max=i;
				break;
			}
			
		}
		 System.out.println(min+" "+max);
		 
	}
}
