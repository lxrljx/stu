package get;
//预测四
import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int ztime=s.nextInt();
		int znum=s.nextInt();
		int[][] dp=new int[100][100];
		int[][] d=new int[100][2];		//i为行 j为列
		//两个for循环正好是把数据全部包括
		for(int i=1;i<=znum;i++) {
			for(int j=0;j<2;j++) {
				 d[i][j]=s.nextInt();
			}
	}
		

		for(int i=1;i<=znum;i++)
		{
			for( int j=ztime;j>=0;j--)
			{
				if(j>=d[i][0])
					dp[i][j]=max(dp[i-1][j-d[i][0]]+d[i][1],dp[i-1][j]);
				else
					dp[i][j]=dp[i-1][j];
			}
		}
		System.out.println(dp[znum][ztime]);
	

	
	}
	public static int max(int a,int b) {
		if(a>b)
		return a;
	else
		return b;
	}

}
