#include <bits/stdc++.h>
using namespace std;

class node
{
public:
    int data;
    node *next;

    node(int val)
    {
        data = val;
        next = NULL;
    }
};

class Queue
{
    node *front;
    node *back;

public:
    Queue()
    {
        front = NULL;
        back = NULL;
    }

    void push(int x)
    {
        node *new_node = new node(x);
        if (front == NULL)
        {
            back = new_node;
            front = new_node;
            return;
        }

        back->next = new_node;
        back = new_node;
    }

    void pop()
    {
        if (front == NULL)
        {
            cout << "No element in queue!";
            return;
        }
        node *to_delete = front;
        front = front->next;
        delete to_delete;
    }

    int peek()
    {
        if (front == NULL)
        {
            cout << "No element in queue!" << endl;
            return -1;
        }
        return front->data;
    }

    bool empty()
    {
        if (front == NULL)
        {
            return true;
        }
        return false;
    }
};

int main()
{

    Queue q;
    q.push(1);
    q.push(3);
    q.push(2);
    cout << q.peek() << endl;
    q.pop();
    cout << q.peek() << endl;
    q.pop();
    cout << q.peek() << endl;
    q.pop();
    cout << q.peek() << endl;
    cout << q.empty() << endl;

    return 0;
}