#include <bits/stdc++.h>
using namespace std;

class my
{
    string s1 = "eawlgnzdek";
    string s2 = "gneakwdezl";
};

int main()
{
    string s1 = "eawlgnzdek";
    string s2 = "gneakwdezl";
    for (int i = 0; i < 4; i++)
    {
        char swap = s2[0];
        s2[0] = s2[3];
        s2[3] = swap;

        if (s1 == s2)
        {
            cout << "YES";
            return true;
        }
        else
        {
            cout << "NO";
            return false;
        }
    }

    return 0;
}