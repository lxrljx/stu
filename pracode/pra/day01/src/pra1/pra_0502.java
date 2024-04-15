package pra1;

import java.util.Scanner;
import java.math.BigInteger;




public class pra_0502 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans=0;
        for (int i=1;i<n+1;i++) {
            int d=1;
                    for(int j=1;j<i+1;j++){
                       d*=j;
                    }
            ans+=d;
        }
        System.out.println(ans);
    }
}





