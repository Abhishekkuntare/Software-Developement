#include <stdio.h>

void display(int arr[], int n)
{
    for (int i = 0; i < n; i++)
        printf("%d ", arr[i]);
}

int linerSearch(int arr[], int n, int item)
{
    int i;
    for (i = 0; i < n; i++)
    {
        if (arr[i] == item)
            return i;
    }
    return -1;
}

int main()
{
    int arr[10], size;

    printf("Enter the size of array: ");
    scanf("%d", &size);

    printf("Enter the %d elements in array: ", size);
    for (int i = 0; i < size; ++i)
    {
        scanf("%d", &arr[i]);
    }
    printf("Input array: ");
    display(arr, size);

    int item;
    printf("\nItem: ");
    scanf("%d", &item);

    int i = linerSearch(arr, size, item);
    if (i == -1)
        printf("Elements does not exits!");
    else
        printf("Element found at %d index", i);

    return 0;
}