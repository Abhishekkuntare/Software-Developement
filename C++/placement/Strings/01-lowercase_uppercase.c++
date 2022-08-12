#include <bits/stdc++.h>
using namespace std;

int main()
{

    string name = "Abhishek";
    cout << 'a' - 'A' << endl; // a is 32 char next after A

    // logically
    // converting to uppercase
    for (int i = 0; i < name.size(); i++)
    {
        if (name[i] >= 'a' && name[i] <= 'z')
            name[i] -= 32;
    }
    cout << name << endl;
    // converting to lowercase
    for (int i = 0; i < name.size(); ++i)
    {
        if (name[i] >= 'A' && name[i] <= 'Z')
            name[i] += 32;
    }
    cout << name << endl;
    cout << endl;

    // inbuild
    transform(name.begin(), name.end(), name.begin(), ::toupper);
    cout << name << endl;

    transform(name.begin(), name.end(), name.begin(), ::tolower);
    cout << name << endl;

    return 0;
}
