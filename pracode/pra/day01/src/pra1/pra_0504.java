package pra1;

import java.util.Scanner;

public class pra_0504 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();        //找到表中的第n个数字
        int i=0,j=0;             //i表示第n个数字在第i行，j表示前i行共有j个数字
        while(j<n) {
            i++;
            j+=i;
        }
        if(i%2==1)   //在奇行
            System.out.print((j-n+1)+"/"+(i-j+n));
        else         //在偶行
            System.out.print((i-j+n)+"/"+(j-n+1));

    }
}
