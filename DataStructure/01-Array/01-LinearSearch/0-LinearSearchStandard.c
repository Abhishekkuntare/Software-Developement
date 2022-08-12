
#include <stdio.h>

int linearSearch(int *A, int n, int item)
{
    int i;
    for (i = 0; i < n; i++)
    {
        if (A[i] == item)
            return i;
    }
    return -1;
}

int main()

{
    int arr[20], i, ITEM, size;

    printf("Enter the size of Array: ");
    scanf("%d", &size);

    printf("Enter the %d elements in array: ", size);
    for (i = 0; i < size; i++)
    {
        scanf("%d", &arr[i]);
    }

    printf("\nInput array: \n");
    for (i = 0; i < size; i++)
    {
        printf("%d ", arr[i]);
    }

    printf("\nEnter the number to search in array: ");
    scanf("%d", &ITEM);

    i = linearSearch(arr, size, ITEM);

    if (i == -1)
    {
        printf("Item not found !");
    }
    else
    {
        printf("Item found in %d index", i);
    }
}