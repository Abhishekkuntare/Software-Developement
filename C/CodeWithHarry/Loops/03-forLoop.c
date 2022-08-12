#include <stdio.h>
int main()
{
    int i;
    int n;
    printf("Enter a number : ");
    scanf("%d", &n);
    for (i = 0; i < n; i++)
    {
        printf("%d\n", i);
    }
    return 0;
}