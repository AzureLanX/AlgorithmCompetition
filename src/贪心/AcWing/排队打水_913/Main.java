package 贪心.AcWing.排队打水_913;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @BelongsProject: AlgorithmCompetition
 * @BelongsPackage: 贪心.AcWing.排队打水_913
 * @Author: JuferBlue
 * @CreateTime: 2025-04-05  23:07
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        int ans = 0;
        for(int i =0;i<n;i++) {
            ans+=a[i]*(n-i-1);
        }
        System.out.println(ans);

    }
}
