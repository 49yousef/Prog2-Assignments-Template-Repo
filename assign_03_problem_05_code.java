// yosuef yasser
//20216049

import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int sum = 0;
            
            for (int j = Math.min(x, y) + 1; j < Math.max(x, y); j++) {
                if (j % 2 == 1) {
                    sum += j;
                }
            }
            
            System.out.println(sum);
        }
        
       
    }
}
