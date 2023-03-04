#include<bits/stdc++.h>
using namespace std;

int main()
{
    int re=4;
    int row, column, data1, data2;
    int datarow, datacolumn;
    int row1, b, a;
    while (re--) {
        scanf("%d %d %d %d", &data1, &data2, &datarow, &datacolumn);
        row1 = datarow * datarow + datacolumn * datacolumn;
        b = (int)(sqrt((double)row1) - 1e-6);
        stack<int> result;
        do {
            for (a = 0; a <= b; a++) {
                row = (data1 - a) * datarow - data2 * (-datacolumn);
                column = (data1 - a) * (-datacolumn) + data2 * datarow;
                if (row % row1 == 0 && column % row1 == 0) {
                    data1 = row / row1;
                    data2 = column / row1;
                    result.push(a);
                    break;
                }
            }
            if (a > b || result.size() > 100) {
                break;
            }
        } while (data1 != 0 || data2 != 0);
        if (data1 != 0 || data2 != 0) {
            puts("The code cannot be decrypted");
        }
        else {
            while(!result.empty()) {
                printf("%d", result.top());
                result.pop();
                putchar(result.empty() ? '\n' : ',');
            }
        }
    }

    return 0;
}