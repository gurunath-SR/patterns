import java.util.Scanner;
public class rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows: ");
        int row = sc.nextInt();
        System.out.print("enter the number of cols: ");
        int cols= sc.nextInt();
        for(int i = 1; i <= row ; i++){
            for(int j = 1; j <= cols; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        sc.close();
    }
}