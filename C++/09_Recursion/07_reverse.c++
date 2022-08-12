#include <bits/stdc++.h>
using namespace std;

void reverse(string s)
{
    // if (s == "\0")
    //     return;
    if (s.length() == 0)
        return;

    string ros = s.substr(1); // delete 1 char in string
    reverse(ros);             // again recursion
    cout << s[0];
}

int main()
{
    string s;
    cout << "Enter the string : " << endl;
    cin >> s;
    reverse(s);
    return 0;
}
