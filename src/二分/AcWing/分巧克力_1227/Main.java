package 二分.AcWing.分巧克力_1227;

import java.util.Scanner;

/**
 * @BelongsProject: AlgorithmCompetition
 * @BelongsPackage: 二分.AcWing.分巧克力_1227
 * @Author: JuferBlue
 * @CreateTime: 2025-01-14  09:38
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {
    static int N = 100010;
    static int[] H = new int[N];
    static int[] W = new int[N];
    static int n,k;
    public static boolean check(int x){
        int sum = 0;
        for(int i = 0;i<n;i++){
            sum += (H[i]/x)*(W[i]/x);
        }
        return sum>=k;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        for(int i = 0;i<n;i++){
            H[i] = sc.nextInt();
            W[i] = sc.nextInt();
        }
        int l = 1,r = 100000;
        while(l<r){
            int mid = l+r+1>>1;
            if(check(mid)) l = mid;
            else r = mid-1;
        }
        System.out.println(l);
    }
}
