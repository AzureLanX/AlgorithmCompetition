package 贪心.AcWing.合并果子_148;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @BelongsProject: AlgorithmCompetition
 * @BelongsPackage: 贪心.AcWing.合并果子_148
 * @Author: JuferBlue
 * @CreateTime: 2025-04-05  22:49
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int n = scanner.nextInt();

        for(int i = 0;i<n;i++) {
            int x = scanner.nextInt();
            minHeap.add(x);
        }
        int ans = 0;
        while(minHeap.size()>1) {
            int x1 = minHeap.poll();
            int x2 = minHeap.poll();
            int sum = x1+x2;
            ans+=sum;
            minHeap.add(sum);
        }
        System.out.println(ans);


    }
}
