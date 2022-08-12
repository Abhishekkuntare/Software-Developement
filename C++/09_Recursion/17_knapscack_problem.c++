#include <bits/stdc++.h>
using namespace std;

int knapscack(int value[], int wt[], int n, int W)
{

    if (n == 0 || W == 0)
        return 0;

    if (wt[n - 1] > W)
        return knapscack(value, wt, n - 1, W);

    return max(knapscack(value, wt, n - 1, W - wt[n - 1]) + value[n - 1], knapscack(value, wt, n - 1, W));
}

int main()
{
    int W = 50;
    int wt[] = {10, 20, 30};
    int value[] = {100, 50, 150};

    cout << knapscack(value, wt, 3, W) << endl;

    return 0;
}