#include <stdio.h>
int main()
{
    int skip = 5, i = 0, n;
    printf("Enter any number : ");
    scanf("%d", &n);
    while (i < n)
    {
        i++;
        if (i != skip)
        {
            continue;
        }
        else
        {
            printf("%d\n", i);
        }
    }
}