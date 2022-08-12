#include <bits/stdc++.h>
using namespace std;

long long int friendsPair(long long int n)
{
    // means person is none,single,pair
    if (n == 0 || n == 1 || n == 2)
        return n;
    if (n > 41)
    {
        cout << "Please enter less than " << n << " people!" << endl;
        exit(0);
    }

    return friendsPair(n - 1) + friendsPair(n - 2) * (n - 1);
}

int main()
{
    long long int n;
    cout << "Enter the friends: ";
    cin >> n;
    cout << friendsPair(n) << " :ways";

    return 0;
}