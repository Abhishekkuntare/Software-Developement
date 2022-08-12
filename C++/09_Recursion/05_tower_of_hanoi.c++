#include <bits/stdc++.h>
using namespace std;

void towerOfHanoi(int n, char start, char end, char mid)
{
    if (n == 0) // base case
        return;
    towerOfHanoi(n - 1, start, mid, end);
    cout << "Move from " << start << " to " << end << endl;
    towerOfHanoi(n - 1, mid, end, start);
}

int main()
{
    towerOfHanoi(3, 'A', 'C', 'B');

    return 0;
}
