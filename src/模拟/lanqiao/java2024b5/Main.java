package 模拟.lanqiao.java2024b5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @BelongsProject: AlgorithmCompetition
 * @BelongsPackage: 模拟.lanqiao.java2024b5
 * @Author: JuferBlue
 * @CreateTime: 2025-04-06  11:21
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {
    static int n;
    static double p;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();//宠物总数
        p = sc.nextDouble();//患病概率

        //题目意思是能恰好平均分，所以每组宠物数k能被n整除
        List<Integer> factors = new ArrayList<>();//收集所有可能的每组宠物数
        for(int i = 1;i<=n;i++){
            if(n%i==0){
                factors.add(i);
            }
        }
        //枚举所有可能的约数k，找到最小期望对应的k
        double ans_K = 0;
        double ans_exp = Double.MAX_VALUE;
        for(int i = 0;i<factors.size();i++){
            int k = factors.get(i);
            double exp = calculateExp(k);
            if(exp<ans_exp){
                ans_exp = exp;
                ans_K = k;
            }
        }
        System.out.println(ans_K);
    }

    private static double calculateExp(int k) {
        if(k==1) return n;
        double probabilityAllNegative = Math.pow(1 - p, k);
        double expectedTestsPerGroup = probabilityAllNegative * 1 + (1 - probabilityAllNegative) * (1 + k);
        return expectedTestsPerGroup * ((double) n / k);
    }
}
