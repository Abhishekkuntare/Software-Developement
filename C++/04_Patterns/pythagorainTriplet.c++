#include <iostream>
using namespace std;

bool pythonge(int x, int y, int z)
{

    int a, b, c;

    if (x > y && x > z)
    {
        a = x;
        b = y;
        c = z;
        cout << "max: " << a << endl;
    }
    else if (y > x && y > z)
    {
        a = y;
        b = x;
        c = z;
        cout << "max: " << a << endl;
    }
    else
    {
        a = z;
        b = x;
        c = y;
        cout << "max: " << a << endl;
    }

    if (a * a == b * b + c * c)
    {
        return true;
    }
    else
    {
        return false;
    }
}

int main()
{
    int a, b, c;
    cin >> a >> b >> c;

    if (pythonge(a, b, c))
        cout << "Pythagorian triplet";
    else
        cout << "Not pythagorian triplet";

    return 0;
}