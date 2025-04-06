package 模拟.lanqiao.java2024b3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @BelongsProject: AlgorithmCompetition
 * @BelongsPackage: 模拟.lanqiao.java2024b3
 * @Author: JuferBlue
 * @CreateTime: 2025-04-06  10:45
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //主节点个数1,副节点个数n-1;
        int n = sc.nextInt();
        //各个副节点同步次数
        int[] sysnc_nums = new int[n];
        //主节点，用于存储元素
        List<Integer> list = new ArrayList<>();

        while (sc.hasNext()) {
            String op = sc.next();
            if(op.equals("add")){
                int node = sc.nextInt();
                list.add(node);
            }else if(op.equals("sync")){
                int node = sc.nextInt();
                if(sysnc_nums[node]<list.size()) sysnc_nums[node]++;//节点同步次数+1
            }else{
                int ans = (int)2e9;
                for(int i =1;i<n;i++){
                    ans = Math.min(ans,sysnc_nums[i]);
                }
                System.out.println(ans);
            }
        }

    }
}
