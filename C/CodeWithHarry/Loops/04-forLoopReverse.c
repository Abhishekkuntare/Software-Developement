#include <stdio.h>
int main()
{
    int n;
    printf("Enter the value of n \n:"),
        scanf("%d", &n);

    for (int i = n; i; i--)
    {
        printf("The value of n is %d\n", i);
    }
}