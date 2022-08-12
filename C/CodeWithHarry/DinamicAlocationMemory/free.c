#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n;
    int *ptr;
    int *ptr1;

    printf("How many integers you want to print: ");
    scanf("%d", &n);

    ptr = (int *)malloc(n * sizeof(int));
    for (int i = 0; i < n; i++)
    {
        ptr1 = (int *)malloc(n * sizeof(int));
        printf("Enter the %d malloc: ", i);
        scanf("%d", &ptr[i]);
        free(ptr1);
    }
    for (int i = 0; i < n; i++)
    {
        printf("The malloc %d is %d\n", i, ptr[i]);
    }
    return 0;
}