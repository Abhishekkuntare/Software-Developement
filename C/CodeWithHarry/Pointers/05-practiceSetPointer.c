#include <stdio.h>
int main()
{
    int a = 5;
    int *b = &a;

    printf("The value of a %d\n", a);
    printf("The address of a %u\n", &a);

    printf("The value of b %d\n", *b);
    printf("The address of  b %u\n", &b);

    return 0;
}