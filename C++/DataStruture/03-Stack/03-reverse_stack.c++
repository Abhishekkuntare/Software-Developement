#include <iostream>
#include <stack>
using namespace std;

void insertBottom(stack<int> &st, int element)
{
    if (st.empty())
    {
        st.push(element);
        return;
    }

    int top_element = st.top();
    st.pop();
    insertBottom(st, element);

    st.push(top_element);
}

void reverse(stack<int> &st)
{
    if (st.empty())
    {
        return;
    }
    int element = st.top(); // store the top
    st.pop();
    reverse(st);
    insertBottom(st, element);
}

int main()
{
    stack<int> st;
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    reverse(st);

    while (!st.empty())
    {
        cout << st.top() << " ";
        st.pop();
    }
    cout << endl;
    return 0;
}