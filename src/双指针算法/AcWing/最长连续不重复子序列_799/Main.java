package 双指针算法.AcWing.最长连续不重复子序列_799;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @BelongsProject: AlgorithmCompetition
 * @BelongsPackage: 双指针算法.AcWing.最长连续不重复子序列_799
 * @Author: JuferBlue
 * @CreateTime: 2025-04-05  11:37
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[1000010];
        Set set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int ans = 0;
        for (int i = 0, j = 0; j < n; j++) {
            while (set.contains(a[j])) {
                set.remove(a[i]);
                i++;
            }
            set.add(a[j]);
            ans = Math.max(ans, j - i + 1);
        }
        System.out.println(ans);
    }
}
