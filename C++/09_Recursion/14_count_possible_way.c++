#include <bits/stdc++.h>
using namespace std;

int countPossibleWay(int n, int start, int end)
{
    if (start == n - 1 && end == n - 1)
        return 1;

    if (start >= n || end >= n)
        return 0;

    return countPossibleWay(n, start + 1, end) + countPossibleWay(n, start, end + 1);
}

int main()
{

    int start = 0, end = 0, n = 5;

    cout << countPossibleWay(n, start, end) << endl;

    return 0;
}