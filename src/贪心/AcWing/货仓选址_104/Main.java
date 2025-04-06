package 贪心.AcWing.货仓选址_104;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @BelongsProject: AlgorithmCompetition
 * @BelongsPackage: 贪心.AcWing.货仓选址_104
 * @Author: JuferBlue
 * @CreateTime: 2025-04-05  23:19
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0;i<n;i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        if(n==1)System.out.println(0);
        else {
            int ans = 0;
            for(int i =0;i<n/2;i++) {
                ans+=(a[n-i-1]-a[i]);
            }
            System.out.println(ans);
        }
    }
}
