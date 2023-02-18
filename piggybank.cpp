#include <iostream>
#include <cstring>
#include <cstdio>
using namespace std;
const int N = 550, M = 5000010;

int n, f[M];

void solve(){
    int t1, t2, n;  cin >> t1 >> t2;
    int m = t2 - t1;

    memset(f, 0x3f, sizeof f);
    f[0] = 0;

    cin >> n;
    for (int i = 0; i < n; i++) 
    {
        int w, v;   cin >> w >> v;
        for (int j = v; j <= m; j++)    
            f[j] = min(f[j], f[j - v] + w);
    }

    if (f[m] == 0x3f3f3f3f) printf("This is impossible.\n");
    else printf("The minimum amount of money in the piggy-bank is %d.\n", f[m]);
}

int main()
{
    int t;  cin >> t;
    while (t--) solve();
    return 0; 
}