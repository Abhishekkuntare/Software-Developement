#include <stdio.h>

void display(int arr[], int n)
{
    for (int i = 0; i < n; i++)
        printf("%d ", arr[i]);
}

int binarySearch(int arr[], int n, int item)
{
    int start = 0, end = n, mid;

    for (int i = 0; i < n; i++)
    {
        mid = (start + end) / 2;
        if (arr[i] == item)
        {
            return mid;
        }
        else if (arr[i] > item)
        {
            end = mid - 1;
        }
        else
        {
            start = mid + 1;
        }
    }
    return -1;
}
int main()
{
    int arr[10], n, item;

    printf("Enter the size of array: ");
    scanf("%d", &n);

    printf("Enter the %d elements in array: ", n);
    for (int i = 0; i < n; ++i)
    {
        scanf("%d", &arr[i]);
    }
    printf("Input array: ");
    display(arr, n);

    printf("\nItem: ");
    scanf("%d", &item);
    int i = binarySearch(arr, n, item);
    if (i == -1)
        printf("Element does not exits!");
    else
        printf("Element found at: %d", i);

    return 0;
}