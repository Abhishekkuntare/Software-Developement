// wap a program to acceept n number of student inforamtion
// #include <bits./stdc++.h>
#include <iostream>
using namespace std;

class Student
{

    // whole class is encapsulation (means private and public section)
private: // this is a abstraction
    int roll;
    char name[13];
    int marks;

public:
    void putData();
    void getData();
};

void Student::putData() // this is a defination
{
    cout << "\nEnter roll name and marks: "; //<< Insertion operator
    cin >> roll >> name >> marks;            //>>Extraaction operator
}
void Student::getdata()
{
    cout << "\nRoll no:" << roll << "\tName:" << name << "\tMarks:" << marks;
}

int main()
{
    Student s1[100];
    int n, i;
    cout << "\nEnter how many record you want: ";
    cin >> n;
    for (i = 0; i < n; i++)
    {
        s1[i].putData(); // it is a funciton calllling
    }

    cout << "\nStudents details are:------------------" << endl;
    for (i = 0; i < n; i++)
    {
        s1[i].getdata();
    }

    return 0;
}