package pra3;

import java.util.Scanner;

public class Main1 {
    

    

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str = s.next();
        char ch[] = str.toCharArray();
        MatchSituation(ch, 11);
        MatchSituation(ch, 21);
        }

    private static void MatchSituation(char[] ch, int system)
    {for(int i = 0; i < ch.length; i+= system) {	// i以system(11/21分制)个为一组
        int j = i;
        int win = 0;		// 华华获胜的场数
        int lose = 0;		// 华华失败的场数
        // 下面循环是判断一局对战，华华和对手胜负情况的
        while(ch[j] != 'E') {				// 显然，退出循环的条件是遇到E了

            if(ch[j] == 'W') {
                win++;
            }else if(ch[j] == 'L') {
                lose++;
            }
            // 判断一场比赛结束的条件是否满足
            if(win + lose >= system) {			// 由于上面for循环中，i我默认控制的是自增11/21，但是当两人比赛超过了11/21场，需要让这场比赛的区间扩大，下面有可能需要让i++

                if(Math.abs(win - lose) >= 2 && (win >= system || lose >= system)) {	// 差值大于2则说明这局比赛已分胜负，并且
                    break;
                }else {		// 此时和已经大于11/21了，但是还是没分出胜负，例如11分制中：5:6，显然这时候还没分出胜负，
                    // 这时为了让下一场比赛的i在正确的位置，需要让i++，理解为i是控制一场比赛的次数的区间长度
                    i++;
                }
            }
            // j移动表示一局比赛的下一个回合
            j++;
        }
        System.out.println(win + ":" + lose);
    }


        }
        }