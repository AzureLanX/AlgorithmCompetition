package 链表.AcWing.双链表_827;

import java.util.Scanner;

/**
 * @BelongsProject: AlgorithmCompetition
 * @BelongsPackage: 链表.AcWing.双链表_827
 * @Author: JuferBlue
 * @CreateTime: 2025-04-05  15:58
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {
    static int idx;
    static int[] pre = new int[100010];
    static int[] ne = new int[100010];
    static int[] e = new int[100010];

    public static void init() {
        idx = 2;
        pre[1] = 0;
        ne[0] = 1;
    }

    //往k的右边插入一个数
    public static void insert(int k,int x) {
        e[idx] = x;
        pre[idx] = k;
        ne[idx] = ne[k];
        pre[ne[k]] = idx;
        ne[k] = idx;
        idx++;
    }
    //删除第k个数
    public static void delete(int k){
        ne[pre[k]] = ne[k];
        pre[ne[k]] = pre[k];

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        init();

        while(m-->0) {
            String op = scanner.next();
            if(op.equals("L")) {
                int x = scanner.nextInt();
                insert(0, x);
            }else if(op.equals("R")) {
                int x = scanner.nextInt();
                insert(pre[1], x);
            }else if(op.equals("D")) {
                int k = scanner.nextInt();
                delete(k+1);
            }else if(op.equals("IL")) {
                int k = scanner.nextInt();
                int x = scanner.nextInt();
                insert(pre[k+1], x);
            }else {
                int k = scanner.nextInt();
                int x = scanner.nextInt();
                insert(k+1, x);
            }
        }
        for(int i = ne[0];i!=1;i=ne[i]) {
            System.out.print(e[i]+" ");
        }

    }

}
