#include <bits/stdc++.h>
using namespace std;

int is_power_of_2(int n)
{
    return (n && !(n & n - 1));
}

int main()
{
    cout << is_power_of_2(8);
    return 0;
}