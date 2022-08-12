#include <bits/stdc++.h>
using namespace std;

// ground (parent)
class ground
{
    int rooms;
    int hall;

public:
    void from_ground()
    {
        cout << "From ground\n";
    }

    void setHall(int h)
    {
        hall = h;
    }
    void getHall()
    {
        cout << hall << endl;
    }
};

// middle (child of ground)
class middle : private ground
{
    int bedrooms;

public:
    void from_middle()
    {
        cout << "From middle\n";
    }
};

// top ( child of middle)
class top : public middle
{
    int toilet;

public:
    void from_top()
    {
        cout << "From top\n";
    }
};

int main()
{
    top t;

    // t.from_ground(); can't access because middle inheritated only private data members and member functions

    t.from_middle();
    t.from_top();

    middle m;
    // m.from_ground(); // can't access because middle inheritated only private data members and member functions

    m.from_middle();

    return 0;
}