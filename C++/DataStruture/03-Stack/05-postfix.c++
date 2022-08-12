#include <bits/stdc++.h>
using namespace std;

int postfix_expression(string s)
{
    stack<int> st;

    // for oprand ---------> left to right
    for (int i = 0; i < s.length(); i++)
    {
        if (s[i] >= '0' && s[i] <= '9')
        {
            st.push(s[i] - '0');
            // ex: s[i]=3 , 3 - '0' = 51 - 48 = 3 ,
            // so why we use this , to  convert  (string to int)
        }
        // for oprator
        else
        {
            int op2 = st.top();
            st.pop();

            int op1 = st.top();
            st.pop();

            switch (s[i])
            {
            case '+':
                st.push(op1 + op2);
                break;

            case '-':
                st.push(op1 - op2);
                break;

            case '*':
                st.push(op1 * op2);
                break;

            case '/':
                st.push(op1 / op2);
                break;

            case '^':
                st.push(pow(op1, op2));
                break;
            }
        }
    }
    return st.top(); // return top most element
}

int main()
{

    cout << "Postfix: " << postfix_expression("46+2/5*7+") << endl;

    return 0;
}