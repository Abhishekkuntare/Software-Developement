#include <iostream> // header file for taking input and output
using namespace std;

int main()
{
    int a;
    cout << "Size of int: " << sizeof(a) << endl;
    float b;
    cout << "Size of float: " << sizeof(b) << endl;
    char c;
    cout << "Size of char: " << sizeof(c) << endl;
    bool d;
    cout << "Size of bool: " << sizeof(d) << endl;

    short int si;
    long int li;
    cout << "Size of short: " << sizeof(si) << endl;
    cout << "Size of long: " << sizeof(li) << endl;

    return 0;
}