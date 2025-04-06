package 栈.AcWing.单调栈_830;

import java.util.Scanner;
import java.util.Stack;

/**
 * @BelongsProject: AlgorithmCompetition
 * @BelongsPackage: 栈.AcWing.单调栈_830
 * @Author: JuferBlue
 * @CreateTime: 2025-04-05  15:59
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int n = scanner.nextInt();

        for(int i = 0;i<n;i++) {
            int x = scanner.nextInt();
            while(!stack.isEmpty()&&x<stack.peek()) {
                stack.pop();
            }
            if(stack.isEmpty()) {
                System.out.print("-1 ");
            }else {
                System.out.print(stack.peek()+" ");
            }
            stack.push(x);
        }

    }
}
