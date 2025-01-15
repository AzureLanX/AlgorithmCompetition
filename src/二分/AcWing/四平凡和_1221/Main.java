package 二分.AcWing.四平凡和_1221;

import java.util.Scanner;

/**
 * @BelongsProject: AlgorithmCompetition
 * @BelongsPackage: 二分.AcWing.四平凡和_1221
 * @Author: JuferBlue
 * @CreateTime: 2025-01-15  07:54
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {
    static int N = 5000010;
    static int[] index_c = new int[N];
    static int[] index_d = new int[N];
    static boolean[] cd = new boolean[N];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int c = 0;c*c<=n;c++){
            for(int d = c;c*c+d*d<=n;d++){
                int temp = c*c+d*d;
                if(!cd[temp]){
                    cd[temp] = true;
                    index_c[temp] = c;
                    index_d[temp] = d;
                }
            }
        }
        for(int a = 0;a*a<=n;a++){
            for(int b = a;a*a+b*b<=n;b++){
                int temp = n-a*a-b*b;
                if(cd[temp]){
                    System.out.println(a+" "+b+" "+index_c[temp]+" "+index_d[temp]);
                    return;
                }
            }
        }
    }
}
