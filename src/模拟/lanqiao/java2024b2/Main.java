package 模拟.lanqiao.java2024b2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @BelongsProject: AlgorithmCompetition
 * @BelongsPackage: 模拟.lanqiao.java2024b2
 * @Author: JuferBlue
 * @CreateTime: 2025-04-06  09:56
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        int n = 10000000;
        for(int i = n;i>=0;i--){
            //初始化数组
            int x = i;
            List<Integer> list = new ArrayList<>();
            while(x!=0){
                list.add(x%10);
                x/=10;
            }
            Collections.reverse(list);
            int len = list.size();
            while(true){
                int sum = 0;
                for(int j =list.size()-1;j>=list.size()-len;j--){
                    sum += list.get(j);
                }
                list.add(sum);
                if(sum==i){
                    System.out.println(i);
                    return;
                }
                if(sum>i){
                    break;
                }
            }
        }
    }
}
