#include <bits/stdc++.h>
using namespace std;

class ground
{
    int rooms;

public:
    void from_ground()
    {
        cout << "From Ground!";
    }
};

class middle
{
    int bedroom;

public:
    void from_middle()
    {
        cout << "From middle!";
    }
};

// multiple inheritance ( two parent)
class top : public middle, public ground
{
};

int main()
{
    top t;
    t.from_ground();
    t.from_middle();
    return 0;
}