import java.util.Scanner;
public class RHT {
   public static void main(String[] args) {
    Scanner wow=new Scanner(System.in);
    int n= wow.nextInt();
    for(int i=n;i>=n;i--){
        for(int j=n;j>=n;j--){
            if(i==j||i==n||j==n)
            System.out.print("* ");
            else
            System.out.print(" ");
        }
        System.out.println();
    }
   } 
}
