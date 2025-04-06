package 前缀和.AcWing.子矩阵的和_796;

import java.util.Scanner;

/**
 * @BelongsProject: AlgorithmCompetition
 * @BelongsPackage: 前缀和.AcWing.子矩阵的和_796
 * @Author: JuferBlue
 * @CreateTime: 2025-04-04  17:07
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int q = scanner.nextInt();

        int[][] a = new int[n+1][m+1];
        for(int i = 1;i<=n;i++) {
            for(int j = 1;j<=m;j++) {
                int x = scanner.nextInt();
                a[i][j] = x+a[i-1][j]+a[i][j-1]-a[i-1][j-1];
            }
        }

        while(q-->0) {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();

            System.out.println(a[x2][y2]-a[x1-1][y2]-a[x2][y1-1]+a[x1-1][y1-1]);

        }
    }
}
