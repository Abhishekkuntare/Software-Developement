#include <stdio.h>

int main()
{
    int a = 1;
    int *b = &a;
    int c = 2;
    int *d = &c;

    printf("The address of a is %u\n", b);
    b++;
    printf("The address of a is %u\n", b);
    b--;
    printf("The address of a is %u\n", b);

    printf("The address of c %u\n", &c);
    printf("The substraction of  %u -  %u = %u", b, d, &a - &c);

    return 0;
}