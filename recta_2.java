import java.util.Scanner;

public class recta_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows:");
        int rows = sc.nextInt();
        System.out.print("enter the number of cols:");
        int cols = sc.nextInt();
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= cols ; j++){
                System.out.print(" ");
                System.out.print(i);
            }
            System.out.println();
        }
        sc.close();
    }
}
/*
1 1 1 1
2 2 2 2
3 3 3 3
4 4 4 4
 */