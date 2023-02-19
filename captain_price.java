import java.util.Scanner;

public class captain_price {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        String s1=in.next();
        String s2=in.next();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                String s3="";
                s3=s3+s1.charAt(i) + s2.charAt(j);
                System.out.println(s3);
            }
        }
    }
}
