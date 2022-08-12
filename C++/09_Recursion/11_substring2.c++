#include <bits/stdc++.h>
using namespace std;

void substring_code(string s, string ans)
{

    if (s.length() == 0)
    {
        cout << ans << endl;
        return;
    }

    char ch = s[0];
    int code = ch; // ascii code
    string ros = s.substr(1);

    substring_code(ros, ans);
    substring_code(ros, ans + ch);
    substring_code(ros, ans + to_string(code));
}

int main()
{
    substring_code("AB", "");

    return 0;
}