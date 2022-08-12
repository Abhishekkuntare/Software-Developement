#include <bits/stdc++.h>
using namespace std;

int main()
{
    string number = "43463693211";
    sort(number.begin(), number.end(), greater<int>());
    cout << number[0] << endl;
    return 0;
}