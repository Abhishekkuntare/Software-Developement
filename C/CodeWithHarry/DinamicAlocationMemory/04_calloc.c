#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n;
    int *ptr;

    printf("How many memory allocation you want ?: ");
    scanf("%d", &n);

    ptr = (int *)calloc(n, sizeof(int));

    for (int i = 0; i < n; i++)
    {
        printf("Enter %d index memory allocated to: ", i);
        scanf("%d", &ptr[i]);
    }

    for (int i = 0; i < n; i++)
    {
        printf("The %d memory allocated to %d\n", i, ptr[i]);
    }

    return 0;
}
