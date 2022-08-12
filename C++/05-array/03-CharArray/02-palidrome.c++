#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n;
    cout << "Enter the size of text: " << endl;
    cin >> n;

    char text[n + 1];
    cout << "Enter the " << n << " length text: " << endl;
    cin >> text;

    bool check = true;
    for (int i = 0; i < n; i++)
    {
        if (text[i] != text[n - 1 - i])
        {
            check = 0;
            break;
        }
    }

    if (check == true)
        cout << text << " is palidrome";

    else
        cout << text << " is not palidrome";

    return 0;
}