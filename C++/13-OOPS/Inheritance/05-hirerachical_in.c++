#include <bits/stdc++.h>
using namespace std;

// parent
class A
{
};

// child of (A) but parent of (D E )
class B : public A
{
};

// child of B
class D : public B
{
};

// child of B
class E : public B
{
};

// child of A but parent of (F G)
class C : public A
{
};

// child of C
class F : public C
{
};
// child of C
class G : public C
{
};

int main()
{

    return 0;
}

// hirerachical inheritance

//                   A
//               /      \
//           B            C
//       /    \         /     \
//    D       E      F      G
