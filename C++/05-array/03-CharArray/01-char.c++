#include <bits/stdc++.h>
using namespace std;

int main()
{

    char name[10];
    cout << "Enter your name: ";
    cin >> name;

    cout << name << endl
         << name[3];

    cout << endl;
    int i = 0;

    while (name[i] != '\0')
    {
        cout << name[i] << endl;
        i++;
    }

    return 0;
}