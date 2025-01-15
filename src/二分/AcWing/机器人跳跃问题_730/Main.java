package 二分.AcWing.机器人跳跃问题_730;

import java.util.Scanner;

/**
 * @BelongsProject: AlgorithmCompetition
 * @BelongsPackage: 二分.AcWing.机器人跳跃问题_730
 * @Author: JuferBlue
 * @CreateTime: 2025-01-15  07:33
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {
    static int N = 100010;
    static int[] H = new int[N];
    static int n;
    static boolean check(int x){
        int e = x;
        for(int i = 1;i<=n;i++){
            if(H[i]>e) e = e-(H[i]-e);
            else e = e+(e-H[i]);
            if(e<0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            H[i] = sc.nextInt();
        }
        int l = 0,r = 100000;
        while(l<r){
            int mid = l+r>>1;
            if(check(mid)) r = mid;
            else l = mid+1;
        }
        System.out.println(l);
    }
}
