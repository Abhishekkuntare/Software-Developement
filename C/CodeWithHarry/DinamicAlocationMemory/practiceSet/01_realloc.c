#include <stdio.h>
#include <stdlib.h>

void main()
{

    int *ptr;

    //  for a malloc
    ptr = (int *)malloc(5 * sizeof(int));
    for (int i = 0; i < 5; i++)
    {
        printf("Enter the %d integer for malloc: ", i);
        scanf("%d", &ptr[i]);
    }
    for (int i = 0; i < 5; i++)
    {
        printf("The value of %d is %d\n", i, ptr[i]);
    }

    // for realloc
    ptr = (int *)realloc(ptr, 10 * sizeof(int));
    for (int i = 0; i < 10; i++)
    {
        printf("Enter the %d integer for malloc: ", i);
        scanf("%d", &ptr[i]);
    }
    for (int i = 0; i < 10; i++)
    {
        printf("The value of %d is %d\n", i, ptr[i]);
    }
}