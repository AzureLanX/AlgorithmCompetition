package 二分.AcWing.数的三次方根_790;

import java.util.Scanner;

/**
 * @BelongsProject: AlgorithmCompetition
 * @BelongsPackage: 二分.AcWing.数的三次方根_790
 * @Author: JuferBlue
 * @CreateTime: 2025-01-13  10:15
 * @Description: https://www.acwing.com/problem/content/792/
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double l = -100,r = 100;
        while(r-l>1e-8){
            double mid = (l+r)/2;
            if(mid*mid*mid>=n) r = mid;
            else l = mid;
        }
        System.out.println(String.format("%.6f",l));
    }
}
