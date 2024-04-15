package pra2;

import java.io.*;
import java.util.*;

public class pra_0602 {


    static int n,k,sum,result;
    static int[] array;
    static boolean[] judge ;

    //judge数组判断扑克牌状态

    public static void main(String[] args) throws IOException{
        sum = 0;
        result = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        array = new int[n];
        judge = new boolean[n];
        for(int i = 0; i < n; i++) {
            array[i] = sc.nextInt();}
        DFS(0,0);
        System.out.println(result);


    }

    private static void DFS(int index , int layer){
        //layer 相当于盒子
        //结束条件
        if(layer == k && Prime(sum)){
            result++;
            return ;
        }
        //i相当于扑克牌
        for(int i = index ; i < array.length ; i++){
            if(!judge[i]){
                //说明i号扑克牌还在手里，需要放入盒子
                layer++;//说明i号扑克牌放入第layer盒子中
                judge[i] = true;
                //此时i号扑克牌已经被使用
                sum += array[i];
                DFS(i , layer);//说明i号扑克牌放入第layer+1盒子中
                //表示dfs调用结束了，换句话说就是扑克牌已经全部放完了
                //需要按照顺序将扑克牌收回，重新放，
                judge[i] = false;
                layer--;
                sum -= array[i];
            }
        }
    }
//判断是否是素数
    private static boolean Prime(int number){
        for(int i = 2 ; i <= (int)(Math.sqrt(number)) ; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}