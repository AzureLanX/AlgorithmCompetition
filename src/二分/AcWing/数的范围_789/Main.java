package 二分.AcWing.数的范围_789;

import java.util.Scanner;

/**
 * @BelongsProject: AlgorithmCompetition
 * @BelongsPackage: 二分.AcWing.数的范围_789
 * @Author: JuferBlue
 * @CreateTime: 2025-01-13  10:15
 * @Description: https://www.acwing.com/problem/content/791/
 * @Version: 1.0
 */
public class Main {
    static int N = 100010;
    static int[] arr = new int[N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        while(q-->0){
            int x = sc.nextInt();
            int l = 0,r = n-1;
            while(l<r){
                int mid = l+r>>1;
                if(arr[mid]>=x) r = mid;
                else l = mid+1;
            }
            if(arr[l]!=x) {
                System.out.println("-1 -1");
            }else{
                System.out.print(l+" ");
                l = 0;
                r = n-1;
                while(l<r){
                    int mid = l+r+1>>1;
                    if(arr[mid]<=x) l = mid;
                    else r = mid-1;
                }
                System.out.println(l);
            }
        }
    }
}
