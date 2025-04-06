package 前缀和.AcWing.差分_797;

import java.util.Scanner;

/**
 * @BelongsProject: AlgorithmCompetition
 * @BelongsPackage: 前缀和.AcWing.差分_797
 * @Author: JuferBlue
 * @CreateTime: 2025-04-04  17:23
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = new int[n+2];
        int[] b = new int[n+2];
        for(int i =1;i<=n;i++) {
            a[i] = scanner.nextInt();
            b[i] = a[i]-a[i-1];
        }

        while(m-->0) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            int c = scanner.nextInt();
            b[l]+=c;
            b[r+1]-=c;
        }

        for(int i = 1;i<=n;i++) {
            b[i] = b[i]+b[i-1];
            System.out.print(b[i]+" ");
        }



    }
}
