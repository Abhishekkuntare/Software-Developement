// time complexity will be O(l) // l will be the length of string

#include <iostream>
#include <math.h>
#include <stack>
using namespace std;

// take the string
int prefix_expression(string s)
{
    stack<int> st;

    // for oprand <--------
    for (int i = s.length() - 1; i >= 0; i--)
    {
        if (s[i] >= '0' && s[i] <= '9')
        {
            st.push(s[i] - '0'); // because it will be integer and put ascii value
        }

        // for oprator
        else
        {
            int op1 = st.top();
            st.pop();
            int op2 = st.top();
            st.pop();

            switch (s[i]) // here s[i] means any one of the operator
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

            case '^': // power
                st.push(pow(op1, op2));
                break;

            default:
                break;
            }
        }
    }

    return st.top(); // top most value
}

int main()
{

    string s = ("-+7*45+20");
    cout << "Prfefix: " << prefix_expression(s) << endl;
    return 0;
}