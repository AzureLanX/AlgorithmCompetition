package 贪心.AcWing.刷杂技的牛_125;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @BelongsProject: AlgorithmCompetition
 * @BelongsPackage: 贪心.AcWing.刷杂技的牛_125
 * @Author: JuferBlue
 * @CreateTime: 2025-04-06  08:23
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Cow> list = new ArrayList<>();
        for(int i =0;i<n;i++) {
            int w = scanner.nextInt();
            int s = scanner.nextInt();
            list.add(new Cow(w, s));
        }
        Collections.sort(list);

        int ans = (int)-2e9;
        int sum = 0;
        for(int i = 0;i<n;i++) {
            Cow cow = list.get(i);
            ans = Math.max(ans, sum-cow.s);
            sum+=cow.w;
        }
        System.out.println(ans);



    }
}
class Cow implements Comparable<Cow>{
    int w,s,sum;
    public Cow(int w,int s) {
        this.w = w;
        this.s = s;
        this.sum = this.w+this.s;
    }

    @Override
    public int compareTo(Cow o) {
        return sum-o.sum;
    }
}
