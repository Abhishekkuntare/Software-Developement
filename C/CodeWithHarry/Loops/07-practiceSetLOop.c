#include <stdio.h>

int main()
{
    int n;
    printf("Enter a table number you want ");
    scanf("%d", &n);

    for (int i = 10; i; i--)
    {
        printf("%d * %d = %d\n", i, n, i * n);
    }
    return 0;
}