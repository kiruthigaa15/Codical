 
 import java.util.Scanner;
 public class HollowS {
    public static void main(String[] args) {
        int i,j;
        Scanner print=new Scanner(System.in);
        int a=print.nextInt();
        for(i=1;i<=a;i++){
            for(j=1;j<=a;j++){
if(i==1||i==a||j==1||j==a)
System.out.print("*");
else
System.out.print(" ");
            }
            System.out.println();
        }

    }
}
