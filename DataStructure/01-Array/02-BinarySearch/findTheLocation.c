#include <stdio.h>

int binarySearch(int *A, int n, int item)
{
    int start = 0, end = n, mid;
    while (start <= end)
    {
        mid = (start + end) / 2;
        if (item == A[mid])
        {
            return mid;
        }
        else if (item > A[mid])
        {
            start = mid + 1;
        }
        else
        {
            end = mid - 1;
        }
    }
    return -1;
}

int main()
{
    int arr[20], i, item, num;

    printf("Enter the size of the array: ");
    scanf("%d", &num);

    printf("Enter the %d elements in array: ", num);
    for (i = 0; i < num; i++)
    {
        scanf("%d", &arr[i]);
    }

    printf("\nInput array: ");
    for (i = 0; i < num; i++)
    {
        printf("%d ", arr[i]);
    }
    printf("\nFind the number in array: ");
    scanf("%d", &item);

    i = binarySearch(arr, num, item);

    if (i == -1)
    {
        printf("Item not found!");
    }
    else
    {
        printf("%d found in index: %d", item, i);
    }
    return 0;
}
