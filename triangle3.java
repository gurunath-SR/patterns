import java.util.Scanner;
public class triangle3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int num = sc.nextInt();
        int temp = num;
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= i-1 ; j++){
                System.out.print("   ");
            }
                for(int k = 1; k <= 2*temp-1;k++){
                    System.out.print(" * ");
                }
             temp--;
            System.out.println();
        }
        sc.close();
    }

    }