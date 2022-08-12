#include <bits/stdc++.h>
using namespace std;

#define n 4

class Stack
{
private:
    int *arr; // dynamic array
    int top;

public:
    Stack() // constructor
    {
        arr = new int[n];
        top = -1;
    }

    void push(int x)
    {
        if (top == n - 1)
        {
            cout << "Stack is Overflow";
            return;
        }
        top++;
        arr[top] = x;
    }

    void pop()
    {
        if (top == -1)
        {
            cout << "Stack is Underflow!";
            return;
        }
        top--;
    }

    int Top()
    {
        if (top == -1)
        {
            cout << "Stack is Underflow!";
            return -1;
        }
        return arr[top];
    }

    bool Empty()
    {
        return top == -1;
    }
};

int main()
{
    Stack st;
    st.push(100);
    st.push(200);
    st.push(300);
    st.push(400);

    cout << endl;
    cout << st.Top() << endl;
    st.pop();
    cout << st.Top() << endl;
    st.pop();
    st.pop();
    st.pop();
    st.pop();
    cout << st.Empty() << endl;

    return 0;
}