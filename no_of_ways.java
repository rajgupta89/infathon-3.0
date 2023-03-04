import java.util.*;

class no_of_ways {
	static int countWays(int n){
		int table[] = new int[n + 1];
		Arrays.fill(table, 0);
		table[0] = 1;
		for (int i = 1; i < n; i++)
			for (int j = i; j <= n; j++)
				table[j] += table[j - i];
	
		return table[n]+1;
	}
	public static void main (String[] args){
        Scanner in=new Scanner(System.in);
		for (int i = 0; i < 6; i++) {
            int n=in.nextInt();
            System.out.println(countWays(n));
        }		
	}
}
