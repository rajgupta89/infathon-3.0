import java.util.Scanner;

public class captain_price {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        String[] s=new String[n];
        for (int i = 0; i < n; i++) {
            s[i]=in.next();
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                String s1="";
                s1+=s[i].charAt(i)+s[i].charAt(j);
                System.out.println(s1);
            }
        }
    }
}
