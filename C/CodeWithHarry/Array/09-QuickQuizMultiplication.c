#include <stdio.h>

int main()
{

    int mul[10];
    int n;
    printf("Enter a number to print the multiplication table :- ");
    scanf("%d", &n);
    for (int i = 10; i; i--)
    {
        mul[i] = n * (i);
    }
    for (int i = 10; i; i--)
    {
        printf("%d * %d = %d\n", n, i, mul[i]);
    }
    return 0;
}