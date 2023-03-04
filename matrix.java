import java.util.*;
class matrix{
    public static int counteven(int[][] a, int n){
        if(a[0][0]==1 && a[0][1]==a[0][0] && a[0][1]==a[0][2]){
           return -1;
        }
        if(a[0][0]==0 && a[0][2]==0 && a[1][0]==1 )
          return n;
        
        return -1;

    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int n=in.nextInt();
            int[][] a=new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j]=in.nextInt();
                }
            }
            System.out.println(counteven(a,n));
        }
    }  
}