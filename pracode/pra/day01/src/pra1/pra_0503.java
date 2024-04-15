package pra1;
import java.util.Scanner;
public class pra_0503 {
        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            System.out.print("输入");
            int m=scan.nextInt();
            fun(m,0);
        }

        private static void fun(int m,int r) {
            if (m == 1)//递归结束
            {
                switch (r) {
                    case 0:
                        System.out.print("2(0)");
                        break;
                    case 1:
                        System.out.print("2");
                        break;
                    case 2:
                        System.out.print("2(2)");
                        break;
                    //处理括号内大于2可在分解的情况
                    default:
                        System.out.print("2(");
                        fun(r, 0);//拿轮数继续分解 递归
                        System.out.print(")");
                        break;
                }
                return;
            } else {
                //一直除2，除一次加一次轮数，比如处理14  14一直除以2直到无法整除时记录最大轮数3
                fun(m / 2, r + 1);
                //是否余数为1  前面完后，剩下的6是在回溯时加的
                if (m % 2 == 1) {
                    switch (r) {
                        case 0:
                            System.out.print("+2(0)");
                            break;
                        case 1:
                            System.out.print("+2");
                            break;
                        case 2:
                            System.out.print("+2(2)");
                            break;
                        //处理括号内大于2可在分解的情况
                        default:
                            System.out.print("+2(");
                            fun(r, 0);//拿轮数继续分解 递归
                            System.out.print(")");
                            break;
                    }
                }
            }
        }}


