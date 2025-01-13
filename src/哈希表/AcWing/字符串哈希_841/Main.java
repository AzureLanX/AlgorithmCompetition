package 哈希表.AcWing.字符串哈希_841;

import java.util.Scanner;

/**
 * @BelongsProject: AlgorithmCompetition
 * @BelongsPackage: 哈希表.AcWing.字符串哈希_841
 * @Author: JuferBlue
 * @CreateTime: 2025-01-12  17:20
 * @Description: https://www.acwing.com/activity/content/problem/content/891/
 * @Version: 1.0
 */

public class Main {
    static int N = 100010;
    static int P = 131;
    static long[] h = new long[N];//存放hash的前缀值
    static long[] p = new long[N];//存放p的次方
    public static long getHash(int l,int r){
        return h[r]-h[l-1]*p[r-l+1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String s = sc.next();
        p[0] = 1;//特殊处理
        //初始化前缀和哈希值
        for(int i = 1;i<=n;i++){
            p[i] = p[i-1]*P;
            h[i] = h[i-1]*P+s.charAt(i-1);
        }
        while(m-->0){
            int l1 = sc.nextInt();
            int r1 = sc.nextInt();
            int l2 = sc.nextInt();
            int r2 = sc.nextInt();
            if(getHash(l1,r1)==getHash(l2,r2)) {
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }

    }
}
