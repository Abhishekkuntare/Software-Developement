#include <bits/stdc++.h>
using namespace std;

int countAllPoint(int start, int end)
{
    if (start == end)
        return 1;

    if (start > end)
        return 0;

    int count = 0;
    for (int i = 1; i <= 6; i++)
    {
        count += countAllPoint(start + i, end);
    }
    return count;
}

int main()
{
    int start = 0, end = 3;
    cout << countAllPoint(start, end) << endl;

    return 0;
}