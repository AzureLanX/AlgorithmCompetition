package 哈希表.AcWing.模拟散列表_840;

import java.util.Scanner;

/**
 * @BelongsProject: AlgorithmCompetition
 * @BelongsPackage: 哈希表.AcWing.模拟散列表_840
 * @Author: JuferBlue
 * @CreateTime: 2025-01-12  17:20
 * @Description: https://www.acwing.com/problem/content/842/
 * @Version: 1.0
 */
//开放寻址法
public class Main {
    static int N = 200003;
    static int nulls = 0x3f3f3f3f;
    static int[] h = new int[N];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i<N;i++){
            h[i] = nulls;
        }
        while(n-->0){
            String op = sc.next();
            int x = sc.nextInt();
            int k = find(x);
            if(op.equals("I")){
                h[k]  = x;
            }else{
                if(h[k] == nulls){
                    System.out.println("No");
                }else{
                    System.out.println("Yes");
                }
            }
        }

    }
    public static int find(int x){
        int k = (x%N+N)%N;
        while(h[k]!=nulls && h[k]!=x){
            k++;
            if(k==N) k = 0;
        }
        return k;
    }
}
