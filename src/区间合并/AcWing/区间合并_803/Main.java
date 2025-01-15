package 区间合并.AcWing.区间合并_803;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @BelongsProject: AlgorithmCompetition
 * @BelongsPackage: 区间合并.AcWing.区间合并_803
 * @Author: JuferBlue
 * @CreateTime: 2025-01-15  08:55
 * @Description: TODO
 * @Version: 1.0
 */
class Range implements Comparable<Range>{
    int l,r;
    public Range(int l,int r){
        this.l = l;
        this.r = r;
    }
    @Override
    public int compareTo(Range o) {
        return l-o.l;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Range> list = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            int l = sc.nextInt();
            int r = sc.nextInt();
            list.add(new Range(l,r));
        }
        Collections.sort(list);
        List<Range> mergeList = Merge(list);
        System.out.println(mergeList.size());
    }
    public static List<Range> Merge(List<Range> list){
        List<Range> mergeList = new ArrayList<>();
        int st = (int)-2e9,ed = (int)-2e9;
        for(Range range:list){
            if(ed<range.l){
                if(st!=(int)-2e9) mergeList.add(new Range(st,ed));
                st = range.l;
                ed = range.r;
            }else{
                ed = Math.max(ed,range.r);
            }
        }
        if(st!=(int)-2e9) mergeList.add(new Range(st,ed));
        return mergeList;
    }
}
