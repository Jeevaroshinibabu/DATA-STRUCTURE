import java.util.Scanner;
public class Spacepyramidpatterns{
    public static void main(String[] args){
        Scanner sc =new Scanner (System.in);
        System.out.print("p:Enter the size of the pyramid:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i+1;k++){
                System.out.print(k+" ");
            }System.out.println();
        }
        sc.close();
    }
}