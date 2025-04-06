package 双指针算法.AcWing.判断子序列_2816;

import java.util.Scanner;

/**
 * @BelongsProject: AlgorithmCompetition
 * @BelongsPackage: 双指针算法.AcWing.判断子序列_2816
 * @Author: JuferBlue
 * @CreateTime: 2025-04-05  11:38
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] a = new int[n];
        int[] b = new int[m];
        for(int i = 0; i <n; i++) {
            a[i] = scanner.nextInt();
        }
        for(int i = 0;i<m;i++) {
            b[i] = scanner.nextInt();
        }

        int i = 0,j = 0;
        for(;i<n&j<m;j++) {
            if(a[i]==b[j]) i++;
        }

        if(i==n) System.out.println("Yes");
        else System.out.println("No");


    }
}
