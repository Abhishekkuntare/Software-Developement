#include <stdio.h>

void add(int n)
{
    printf("The address of n is %u\n", &n);
}

int main()
{
    int i = 9;
    printf("The value of i is %d\n", i);
    add(i);
    printf("The address of i is %u\n", &i);

    return 0;
}
