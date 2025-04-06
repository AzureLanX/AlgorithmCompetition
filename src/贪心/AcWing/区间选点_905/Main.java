package 贪心.AcWing.区间选点_905;

/**
 * @BelongsProject: AlgorithmCompetition
 * @BelongsPackage: 贪心.AcWing.区间选点_905
 * @Author: JuferBlue
 * @CreateTime: 2025-04-06  08:44
 * @Description: TODO
 * @Version: 1.0
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Range> list = new ArrayList<>();
        int n = scanner.nextInt();
        for(int i =0;i<n;i++) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            list.add(new Range(l, r));
        }
        Collections.sort(list);

        int ans = 0;
        int ed = (int)-2e9;

        for(int i =0;i<n;i++) {
            Range range = list.get(i);
            if(range.l>ed) {
                ans++;
                ed = range.r;
            }
        }
        System.out.println(ans);
    }
}

class Range implements Comparable<Range>{
    int l,r;
    public Range(int l,int r) {
        this.l = l;
        this.r = r;
    }
    @Override
    public int compareTo(Range o) {
        return r-o.r;
    }
}
