#include <bits/stdc++.h>
using namespace std;

int no_of_ones(int n)
{
    int count = 0;
    while (n) // or n!=0
    {
        n = (n & (n - 1));
        count++;
    }
    return count;
}

int main()
{
    cout << no_of_ones(19);
    return 0;
}