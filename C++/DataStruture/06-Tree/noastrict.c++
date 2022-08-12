#include <bits/stdc++.h>
using namespace std;

class Solution
{
public:
    int countAsterisks(string s)
    {
        queue<string> s;
        queue<string> ans;
        int count = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if (s.front() == '|' and s.back() == '|')
            {
                while (!s.empty())
                {
                    s.pop_back();
                    cout << s << endl;
                }
            }
        }
    }
};

int32_t main()
{
    Solution sl;
    string s = "l|*e*et|c**o|*de|";
    sl.countAsterisks(s);
}