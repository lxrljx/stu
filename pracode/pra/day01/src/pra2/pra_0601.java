package pra2;

import java.util.Scanner;

public class pra_0601 {
    static int ans = 0;

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        pra_0601 p=new pra_0601();
        for (int i = a; i <= b; i++) {
            int j = a * b / i; //这就是优化的地方，因为X0乘Y0=P乘Q，所以j可以不用for循环，直接用a*b/i就行了
            if (p.lcm(i, j) == a &&p. gcd(i, j) == b)  //如果用函数算出来i和j的最大公约数和最小公倍数与a，b相等
            {
                ans++;//标记加1
            }
        }
        System.out.println(ans); //输出
    }
    public int lcm(int a, int b)//最小公倍数函数
    {
        if (a < b) {
            int c = a;
            a = b;
            b = c;
        }
        if (a % b == 0) {
            return b;//辗转相除法
        } else {
            return lcm(b, a % b);
        }
    }

    public int gcd(int a, int b)//最大公约数函数
    {
        return (a * b / lcm(a, b));// 直接用前面 X0乘Y0=P乘Q的公式求出最大公约数
        //两个数相乘=最大公约数*最小公倍数
    }
}

//辗转相除求最大公约数
//    public static int getGcd(int num1, int num2) {
//
////两个数字num1 > num2
//
//        if (num1 < num2) {
//
//            int temp = num1;
//
//            num1 = num2;
//
//            num2 = temp;
//        }
//
//        int rem = -1;
//
//        while (num1 % num2 != 0) {
//
//            rem = num1 % num2;
//
//            num1 = num2;
//
//            num2 = rem;
//
//        }
//
//        return num2;
//
//   }
