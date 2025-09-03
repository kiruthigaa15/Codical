import java.util.Scanner;
public class numcrun {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        int a=num.nextInt();
         int count=0;
         while(a>0){
            a=a/10;
            count++;

         }
         System.out.print(count);



    }
   
}
