#include <bits/stdc++.h>
using namespace std;

int power(int n, int p)
{
    if (p == 0)
        return 1;

    int prev = power(n, p - 1);
    return (n * prev);
}
int factorial(int n)
{
    if (n == 0)
        return 1;

    int prev_fact = factorial(n - 1);
    return n * prev_fact;
}

int main()
{
    int n, p;
    cin >> n >> p;
    cout << power(n, p) << endl;

    return 0;
}