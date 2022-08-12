#include <bits/stdc++.h>
using namespace std;

class laptop
{
private:
    string location;
    string accessory;

public:          // access modifier
    string name; // data members
    float price;
    string specification;

    // default constructor
    laptop()
    {
        cout << "Default construtor ";
    }

    // parameterised  constructor
    laptop(string nam, float pri, string spe)
    {
        name = nam;
        price = pri;
        specification = spe;
    }

    // copy constructor
    laptop(laptop &asus)
    {
        name = asus.name;
        price = asus.price;
        specification = asus.specification;
    }

    void printdetails()
    {
        cout << name << endl;
        cout << price << endl;
        cout << specification << endl;
    }

    void setLocation(string loc)
    {
        location = loc;
    }
    void getLocation()
    {
        cout << location << endl;
    }
    void setAccessory(string acce)
    {
        accessory = acce;
    }
    void getAccessory()
    {
        cout << accessory << endl;
    }

    // ~laptop()
    // {
    //     cout << "Iam the deconstructor from the thanos" << endl;
    // }

    bool operator==(laptop &asus)
    {
        if (name == asus.name && price == asus.price && specification == asus.specification)
            return true;
        else
            return false;
    }
};

class function_overfloading
{
public:
    void fuc()
    {
        cout << "No arguments" << endl;
    }
    void fuc(int id)
    {
        cout << id << " ID: argument" << endl;
    }
    void fuc(string name)
    {
        cout << name << "Name:  argument" << endl;
    }
};

int main()
{
    int n;
    cout << "Enter the size:" << endl;
    cin >> n;

    // laptop arr[n]; // creating the array object
    // for (int i = 0; i < n; i++)
    // {
    //     cout << "Name:" << endl;
    //     cin >> arr[i].name;
    //     cout << "Price: " << endl;
    //     cin >> arr[i].price;
    //     cout << "specification: " << endl;
    //     cin >> arr[i].specification;
    // }
    // for (int i = 0; i < n; i++)
    // {
    //     cout << "Name:" << endl;
    //     cout << arr[i].name;
    //     cout << "Price: " << endl;
    //     cout << arr[i].price;
    //     cout << "specification: " << endl;
    //     cout << arr[i].specification;
    // }

    // for (int i = 0; i < n; i++)
    // {
    //     string s, s1;
    //     cin >> s >> s1;
    //     arr->setLocation(s);
    //     arr->setAccessory(s1);
    // }
    // arr->getLocation();
    // arr->getAccessory();
    laptop hp("HP", 5300.90, "ram,rom");
    hp.printdetails();

    laptop asus("apple", 91.000, "Speed,performance");
    //  asus.printdetails();
    laptop apple = asus; // copy all the data in apple object
    // apple.printdetails();

    if (apple == asus)
        cout << "Same";
    else
        cout << "distict";

    // funciton overloading
    function_overfloading fo;
    fo.fuc();
    fo.fuc(19);
    fo.fuc("Abhishek");
    return 0;
}