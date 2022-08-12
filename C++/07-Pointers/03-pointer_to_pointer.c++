#include <bits/stdc++.h>
using namespace std;

int main()
{
    int a = 10;
    int *b = &a;  // Storing the address of a (int pointer variable)
    int **c = &b; // Storing the address of  b (int pointer to pointer  variable)

    cout << a << endl;   // 10
    cout << *b << endl;  // 10
    cout << **c << endl; // 10

    cout << b << endl;  // address of  a
    cout << &b << endl; // address of b
    cout << *c << endl;

    return 0;
}