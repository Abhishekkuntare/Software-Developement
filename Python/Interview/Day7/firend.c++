#include <iostream>
using namespace std;

class A
{
private:
    int a, b;

public:
    void accept()
    {
        cout << "Enter a number: ";
        cin >> a >> b;
    }
    friend void max(A a1);
};
void max(A a1)
{
    if (a1.a > a1.b)
    {
        cout << "\nMax number: " << a1.a;
    }
    else
    {
        cout << "\nMax number: " << a1.b;
    }
}