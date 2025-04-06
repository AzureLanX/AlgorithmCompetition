package 链表.AcWing.单链表_826;

import java.util.Scanner;

/**
 * @BelongsProject: AlgorithmCompetition
 * @BelongsPackage: 链表.AcWing.单链表_826
 * @Author: JuferBlue
 * @CreateTime: 2025-04-05  15:58
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {
    static int N = 100010;
    static int head,idx;
    static int[] e = new int[N];
    static int[] ne = new int[N];

    public static void init() {
        head = -1;
        idx = 0;
    }

    public static void add_to_head(int x) {
        e[idx] = x;
        ne[idx] = head;
        head = idx;
        idx++;
    }
    public static void remove(int k) {
        ne[k] = ne[ne[k]];
    }

    public static void add(int k,int x) {
        e[idx] = x;
        ne[idx] = ne[k];
        ne[k] = idx;
        idx++;

    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();

        init();

        while(m-->0) {
            String s = scanner.next();
            char op = s.charAt(0);

            if(op=='H') {
                int x = scanner.nextInt();
                add_to_head(x);
            }else if(op=='D') {
                int k = scanner.nextInt();
                if(k==0) {
                    head = ne[head];
                }else {
                    //题目中k>=1
                    remove(k-1);
                }
            }else {
                int k = scanner.nextInt();
                int x = scanner.nextInt();
                add(k-1,x);
            }
        }
        //输出
        for(int i = head;i!=-1;i = ne[i]) {
            System.out.print(e[i]+" ");
        }

    }
}
