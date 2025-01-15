package 位运算.AcWing.二进制中1的个数_801;

import java.util.Scanner;

/**
 * @BelongsProject: AlgorithmCompetition
 * @BelongsPackage: 位运算.AcWing.二进制中1的个数_801
 * @Author: JuferBlue
 * @CreateTime: 2025-01-15  08:38
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            int x = sc.nextInt();
            int ans = 0;
            while(x!=0){
                x-=(x&-x);
                ans++;
            }
            System.out.print(ans+" ");
        }
    }
}
