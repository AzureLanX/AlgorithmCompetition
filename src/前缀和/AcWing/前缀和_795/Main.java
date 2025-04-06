package 前缀和.AcWing.前缀和_795;
import java.util.Scanner;
/**
 * @BelongsProject: AlgorithmCompetition
 * @BelongsPackage: 前缀和.AcWing.前缀和_795
 * @Author: JuferBlue
 * @CreateTime: 2025-04-04  15:52
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = new int[n+1];
        for(int i = 1;i<=n;i++) {
            int x = scanner.nextInt();
            a[i] = x+a[i-1];
        }

        while(m-->0) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            System.out.println(a[r]-a[l-1]);
        }
    }
}
