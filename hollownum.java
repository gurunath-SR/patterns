import java.util.Scanner;

public class hollownum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows:");
        int rows = sc.nextInt();
        System.out.print("enter the number of cols:");
        int cols = sc.nextInt();
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= cols ; j++){
                if(i == 1 || i==rows || j == 1 || j==cols){
                //System.out.print("");
                System.out.print(j);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}