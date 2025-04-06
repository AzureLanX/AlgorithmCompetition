package 前缀和.AcWing.差分矩阵_798;

import java.util.Scanner;

/**
 * @BelongsProject: AlgorithmCompetition
 * @BelongsPackage: 前缀和.AcWing.差分矩阵_798
 * @Author: JuferBlue
 * @CreateTime: 2025-04-05  10:53
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int q = scanner.nextInt();

        int[][] a = new int[n+2][m+2];
        int[][] b = new int[n+2][m+2];

        for(int i = 1;i<=n;i++) {
            for(int j = 1;j<=m;j++) {
                a[i][j] = scanner.nextInt();
                b[i][j] = a[i][j]-a[i-1][j]-a[i][j-1]+a[i-1][j-1];
            }
        }

        while(q-->0) {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();
            int c = scanner.nextInt();

            b[x1][y1]+=c;
            b[x2+1][y2+1]+=c;
            b[x1][y2+1]-=c;
            b[x2+1][y1]-=c;
        }

        for(int i = 1;i<=n;i++) {
            for(int j = 1;j<=m;j++) {
                b[i][j] = b[i][j]+b[i-1][j]+b[i][j-1]-b[i-1][j-1];
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
}
