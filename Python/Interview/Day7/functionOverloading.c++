#include <iostream>
using namespace std;

// Wap a program to calculate area of circle ,rectangle,traingle and square
class A
{
private:
    float Ac, At;
    int Ar, As;

public:
    void Area(float r)
    {
        Ac = 3.14 * r * r;
        cout << "\nArea of Circle: " << Ac;
    }
    void Area(int l, int b)
    {
        Ar = l * b;
        cout << "\nArea of reactangle: " << Ar;
    }
    void Area(float h, float w)
    {
        At = 0.5 * h * w;
        cout << "\nArea of Traingle: " << At;
    }
    void Area(int side)
    {
        As = side * side;
        cout << "\nArea of Square: " << As;
    }
};

int main()
{
    A a1;
    int side, l, b;
    float r, h, w;

    cout << "\nEnter radius: ";
    cin >> r;
    a1.Area(r); // circle

    cout << "\nEnter lenght and bredth: ";
    cin >> l >> b;
    a1.Area(l, b); // rectangle

    cout << "\nEnter height and width: ";
    cin >> h >> w;
    a1.Area(h, w); // Triangle

    cout << "\nEnter side: ";
    cin >> side;
    a1.Area(side); // Square

    return 0;
}