
#include <bits/stdc++.h>
using namespace std;

int sum_of_number(int n)
{
    if (n == 0)
        return 0;

    int prev = sum_of_number(n - 1);
    return n + prev;
}

int main()
{
    int n;
    cout << "Enter the number: " << endl;
    cin >> n;
    cout << sum_of_number(n) << endl;

    return 0;
}