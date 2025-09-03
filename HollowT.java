import java.util.Scanner;
public class HollowT {
    public static void main(String args[]) {
        Scanner tri=new Scanner(System.in);
        int n=tri.nextInt();
                for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
               if(i==j||i==n||j==1)
                System.out.print("*");
               else 
               System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
