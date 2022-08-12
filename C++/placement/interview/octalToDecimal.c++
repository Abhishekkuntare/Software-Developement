#include <bits/stdc++.h>
using namespace std;

int octalToDecimal(int n)
{
    int ans = 0;
    int x = 1;

    while (n > 0)
    {
        int y = n % 10;
        ans = ans + (x * y);
        x *= 8;  // this is a base
        n /= 10; // For new value in assending order
    }
    return ans;
}

int main()
{
    int n;
    cin >> n;

    int value = octalToDecimal(n);
    cout << value << endl;

    return 0;
}