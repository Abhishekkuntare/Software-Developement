#include <bits/stdc++.h>
using namespace std;

// parent class
class ground
{
    int rooms; // private access modifier
public:
    void from_groud()
    {
        cout << "Groud flower!";
    }
};

// child class

// single inheritance from ground
class middle : public ground
{
public:
};

int main()
{
    middle m;
    m.from_groud();

    return 0;
}