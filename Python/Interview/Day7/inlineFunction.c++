#include <iostream>
using namespace std;

class Employee
{
private:
    int id;
    long int salary;
    char name[20];

public:
    inline void accept()
    {
        cout << "\nEnter id,salary,and name: ";
        cin >> id >> salary >> name;
    }
    inline void display()
    {
        cout << "\nid: " << id;
        cout << "\nsalary: " << salary;
        cout << "\nname: " << name;
    }
};

int main()
{
    Employee e1;
    e1.accept();
    e1.display();
    return 0;
}