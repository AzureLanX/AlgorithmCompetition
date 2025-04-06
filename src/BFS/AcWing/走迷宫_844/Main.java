package BFS.AcWing.走迷宫_844;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @BelongsProject: AlgorithmCompetition
 * @BelongsPackage: BFS.AcWing.走迷宫_844
 * @Author: JuferBlue
 * @CreateTime: 2025-04-06  12:57
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {
    static int N = 110;
    static int n,m;
    static int[][] g = new int[N][N];//地图
    static int[][] d = new int[N][N];//存储最短距离
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                g[i][j] = sc.nextInt();
            }
        }
        System.out.println(bfs());
    }

    public static int bfs() {
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(0,0));
        for(int i =0;i<n;i++){
            Arrays.fill(d[i],-1);
        }
        d[0][0] = 0;
        int[] dx = {-1,0,1,0},dy = {0,1,0,-1};
        while(!q.isEmpty()){
            Point cur = q.poll();
            for(int i = 0;i<4;i++){
                int x = cur.x+dx[i];
                int y = cur.y+dy[i];
                //说明这个点能走且没走过
                if(x>=0&&x<n&&y>=0&&y<m&&g[x][y]==0&&d[x][y]==-1){
                    d[x][y] = d[cur.x][cur.y]+1;
                    q.add(new Point(x,y));
                }
            }
        }
        return d[n-1][m-1];
    }
}

class Point{
    int x,y;
    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }
}
