#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n;
    int n1;
    int *ptr;
    int *ptr1;

    printf("How many integers you want to print: ");
    scanf("%d", &n);

    ptr = (int *)malloc(n * sizeof(int));

    for (int i = 0; i < n; i++)
    {
        ptr1 = (int *)malloc(n * sizeof(int));
        printf("Enter the %d element for malloc: ", i);
        scanf("%d", &ptr[i]);
        free(ptr1);
    }
    for (int i = 0; i < n; i++)
    {
        printf("The value of %d is %d\n", i, ptr[i]);
    }

    // reallocated memory
    printf("How many integers you want to print: ");
    scanf("%d", &n1);

    ptr = realloc(ptr, n1 * sizeof(int));

    for (int i = 0; i < n1; i++)
    {
        printf("Enter the value of %d element: ", i);
        scanf("%d", &ptr[i]);
    }
    for (int i = 0; i < n1; i++)
    {
        printf("The value for %d is %d\n", i, ptr[i]);
    }
    return 0;
}