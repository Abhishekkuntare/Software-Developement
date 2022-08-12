#include <bits/stdc++.h>
using namespace std;

int tilling_problems(int n)
{
    if (n == 0)
        return 0;

    if (n == 1)
        return 1;

    return tilling_problems(n - 1) + tilling_problems(n - 2);
}

int main()
{
    int n;
    cout << "Enter the size: ";
    cin >> n;

    cout << tilling_problems(n) << ":ways ";
    return 0;
}