package 双指针算法.AcWing.数组元素的目标和_800;

import java.util.Scanner;

/**
 * @BelongsProject: AlgorithmCompetition
 * @BelongsPackage: 双指针算法.AcWing.数组元素的目标和_800
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
        int x = scanner.nextInt();

        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int j = 0; j < m; j++) {
            b[j] = scanner.nextInt();
        }

        int ans1=0,ans2=0;
        for(int i=0,j=m-1;i<n;i++) {
            while(a[i]+b[j]>x) j--;
            if(a[i]+b[j]==x) {
                ans1 = i;
                ans2 = j;
                break;
            }
        }
        System.out.println(ans1+" "+ans2);

    }
}
