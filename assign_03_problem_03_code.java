// yousef yasser
//20216049



import java.util.Scanner;

public class JOE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(++count + " ");
            System.out.print(++count + " ");
            System.out.print(++count + " ");
            System.out.print("PUM");
            System.out.println();
            ++count;
        }
        
    }
}
