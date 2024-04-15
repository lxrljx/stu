package pra3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Main {
    static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    static PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    public static void main(String[] args) throws IOException {

        char[] ch = null;
        String str = "";
        in.nextToken();
        str += in.sval;		// 先加入第一行对局情况
        while(true) {		// 再循环加入对局情况
            if(str.indexOf('E') == -1) {// 如果这一行不存在E，则继续输入
                in.nextToken();
                str += in.sval;
            }else {						// 否则，退出输入
                break;
            }
        }
        // 用一个字符数组存储全部输入的对局情况，上面的str是不包括'\n'（回车）的
        ch = str.toCharArray();
        MatchSituation(ch, 11);		// 打印11分制情况
        out.println();				// 空一行
        MatchSituation(ch, 21);		// 打印21分制情况
        out.close();
    }
    /**
     *
     * @param ch（比赛情况）
     * @param system（11分制/21分制）
     */
    public static void MatchSituation(char[] ch, int system) {
        for(int i = 0; i < ch.length; i+= system) {	// i以system(11/21分制)个为一组
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
            out.println(win + ":" + lose);
        }
    }
}