// Create a class bank having data members acount_no,account_holder_name,bank_name,Account_type,balance , amount
// Saving : min balance is 1000
// Current: min balance is 5000
// 1.create a function ACcept() to accept this data
// 2. create a function display() to print the data;
// 3. create a function withdraw() the amount and display the balance
// 4. create a fuction deposite() to deposite amount and then display() the balance
// 5. create a function print () which will gives you a receipt

#include <iostream>
#include <string.h>
using namespace std;

class Bank
{
public:
    int account_no;
    char account_holder_name[25], bank_name[25], account_type[25];
    float balance, ammount;

public:
    void Accept()
    {
        cout << "\nEnter: accountNo HolderName BankName AccountType: ";
        cin >> account_no >> account_holder_name >> bank_name >> account_type;
        if ((strcmpi(account_type, "Saving")) == 0)
        {
            balance = 1000;
        }
        else if ((strcmpi(account_type, "Current")) == 0)
        {
            balance = 5000;
        }
        else
        {
            cout << "\nInvalid account type!";
        }
    }

    void Display()
    {
        cout << "\nAccunt no:" << account_no;
        cout << "\nAccount hoder name:" << account_holder_name;
        cout << "\nBank name:" << bank_name;
        cout << "\nAcccount type:" << account_type;
    }
    void withDraw()
    {
        cout << "\nEnter amount which you want to withdraw: ";
        cin >> ammount;
        if (balance >= ammount)
        {
            balance = balance - ammount;
            cout << "\nAfter withdrwing amount: \n"
                 << balance;
        }
        else
        {
            cout << "\nSorry insuffient Amount!";
        }
    }
    void Deposit()
    {
        cout << "\nEnter the amount which you want to Deposit: ";
        cin >> ammount;
        balance = balance + ammount;
        cout << "\nAfter deposit amount: " << balance;
    }
};

int main()
{
    Bank B;
    B.Accept();
    B.withDraw();
    B.Deposit();
    B.Display();
    return 0;
}