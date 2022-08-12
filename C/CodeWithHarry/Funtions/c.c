#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main()
{
    int a, b;
    scanf("%d\n%d", &a, &b);
    for (int i = a; i < b - 1; i++)
    {
        if (i % 2 == 0)
        {
            printf("eight\n");
        }
        else
        {
            printf("nine\n");
        }
    }
    for (int i = a; i < b - 1; i++)
    {
        if (i % 2 == 0)
        {
            printf("even\n");
        }
        else
        {
            printf("odd\n");
        }
    }

    return 0;
}
