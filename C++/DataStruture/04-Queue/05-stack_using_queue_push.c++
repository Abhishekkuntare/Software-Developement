#include <bits/stdc++.h>
using namespace std;

class Stack
{
private:
    int N;
    queue<int> q1;
    queue<int> q2;

public:
    // default constructor
    Stack()
    {
        N = 0;
    }

    void push(int x)
    {
        // 1.push in q2 first element
        q2.push(x);
        N++;
        // 2.push element until q1 is empty
        while (!q1.empty())
        {
            q2.push(q1.front());
            q1.pop();
        }
        // 3. swapt q1 and q2
        queue<int> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    void pop()
    {
        q1.pop();
        N--;
    }

    int top()
    {
        return q1.front();
    }
    int size()
    {
        return N;
    }
};

int main()
{

    Stack st;
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);

    cout << st.top() << endl;
    cout << st.size() << endl;
    st.pop();

    cout << st.top() << endl;
    cout << st.size() << endl;
    st.pop();

    cout << st.top() << endl;
    cout << st.size() << endl;

    return 0;
}
