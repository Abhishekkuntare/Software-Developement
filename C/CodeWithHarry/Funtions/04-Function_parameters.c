#include <stdio.h>

int mul(int a, int b);

int main()
{
    int ans;
    ans = mul(5, 5);
    printf("The ans is %d", ans);
    return 0;
}

int mul(int a, int b)
{
    int result;
    result = a * b;
    return result;
}