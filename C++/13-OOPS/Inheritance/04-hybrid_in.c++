#include <bits/stdc++.h>
using namespace std;

// parent
class ground
{
    int hall;

public:
    void from_ground()
    {
        cout << "From ground\n";
    }
};

// child of ground
class middle : public ground
{
    int bedrooms;

public:
    void from_middle()
    {
        cout << "From middle\n";
    }
};

// no one's child but parent of top
class middleUP
{
    int toilet;

public:
    void from_middleUP()
    {
        cout << "From middle up\n";
    }
};

// (child of middle and middleUp)
class top : public middle, public middleUP
{
public:
    void form_top()
    {
        cout << "From top\n";
    }
};

int main()
{
    top t;
    t.form_top();
    t.from_middle();
    t.from_middleUP();
    t.from_ground();

    return 0;
}