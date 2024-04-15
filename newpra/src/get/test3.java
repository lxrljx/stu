package get;
//预测5
import java.util.Scanner;


import java.util.*;

public class test3 {
	static int[][] map;
	static int m;
	static int n;
	// 存储搜索路径
    static List<int[]> path = new ArrayList<>();
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		 m=s.nextInt();
		 n=s.nextInt();
		 map=new int[100][100];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				map[i][j]=s.nextInt();
			}}
		 dfs(0,0);
	}

    // DFS 搜索迷宫
    public static void dfs(int x, int y) {
        // 如果当前位置是终点，则搜索完成
        if (x == m-1 && y == n-1) {
            // 打印搜索路径
        	//for(数组类型 变量：数组名) 用于遍历数组集合
        	int len=0;
            for (int[] p : path) {
                len++;
            	//System.out.print("(" + p[0] + "," + p[1] + ") ");
            }
            System.out.println("(" + x + "," + y + ")");
            System.out.println(++len);
            return;//出口
        }

        // 标记当前位置已经走过
        map[x][y] = 2;

        // 将当前位置加入搜索路径
        path.add(new int[]{x, y});

        // 分别搜索当前位置的上下左右四个方向
        if (x > 0 && map[x-1][y] == 0) {
            dfs(x-1, y);
        }
        if (y > 0 && map[x][y-1] == 0) {
            dfs(x, y-1);
        }
        if (x < m-1 && map[x+1][y] == 0) {
            dfs(x+1, y);
        }
        if (y < n-1 && map[x][y+1] == 0) {
            dfs(x, y+1);
        }

        // 如果没有找到终点，将当前位置从搜索路径中移除
        path.remove(path.size()-1);
    }

}
