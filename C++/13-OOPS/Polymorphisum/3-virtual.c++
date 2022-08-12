#include <bits/stdc++.h>
using namespace std;

/*
before virtual output will be
     This the base class
     This is the base display func

After virtual output will be
     This the derived  class
     This is the derived display func
*/

class base
{
public:
    virtual void print()
    {
        cout << "This the base class" << endl;
    }
    virtual void display()
    {
        cout << "This is the base display func" << endl;
    }
};

class derived : public base
{
public:
    void print()
    {
        cout << "This the derived class" << endl;
    }
    void display()
    {
        cout << "This is the derived display func" << endl;
    }
};

int main()
{
    base *base_ptr; // creating the base class pointer
    derived d;      // creating the derived object

    // inside the base_ptr we will put the derived class pointer
    base_ptr = &d;

    base_ptr->print();
    base_ptr->display();

    return 0;
}