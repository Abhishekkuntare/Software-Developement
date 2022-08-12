#include <bits/stdc++.h>
using namespace std;

class employee
{
public:
    void fun()
    {
        cout << "No arguments" << endl;
    }

    // function overloading
    void fun(int a)
    {
        cout << "with " << a << " argumnets " << endl;
    }

    // function overloading
    void fun(string s)
    {
        cout << "with " << s << " argument" << endl;
    }
};

int main()
{
    employee e1;
    e1.fun();
    e1.fun(4);
    e1.fun("Abhishek");
    return 0;
}