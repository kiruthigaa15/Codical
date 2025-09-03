import java.util.Scanner;

public class Patter {
    public static void main(String[] args) {
        int i,j;
        Scanner star=new Scanner(System.in);
        int n=star.nextInt();
        for(i=1;i<=n;i++){
         for(j=1;j<=n-i;j++){
           System.out.print(" ");}
          for(j=1;j<=i;j++){
           System.out.print("*");
        }
        System.out.println();
        }
    }
    
    }

