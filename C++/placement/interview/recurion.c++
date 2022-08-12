#include <bits/stdc++.h>
using namespace std;

int fun(int a, int b)
{
    if (a > 1 || b > 1)
    {
        return fun(0, 0) + fun(0, 1) + fun(a - 1, a - 1);
    }
    else
    {
        a = a + 1;
        b = b - 1;
    }
    return a + 2 - b;
}

int main()
{
    cout << fun(2, 1);

    return 0;
}