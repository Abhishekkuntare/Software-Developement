#include <bits/stdc++.h>
using namespace std;

class Complex
{
private:
    int real, imaginary;

public:
    // constructor
    Complex(int r = 0, int i = 0)
    {
        real = r;
        imaginary = i;
    }

    // by reference
    Complex operator+(Complex const &obj)
    {
        Complex res;
        res.imaginary = imaginary + obj.real;
        res.real = real + obj.imaginary;
        return res;
    }

    void display()
    {
        cout << real << " + i" << imaginary << endl;
    }
};

int main()
{
    Complex c1(12, 7); // passing parameters
    Complex c2(6, 7);  // passing parameters
    Complex c3 = c1 + c2;
    c3.display();
    return 0;
}