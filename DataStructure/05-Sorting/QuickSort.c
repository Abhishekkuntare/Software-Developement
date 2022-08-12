
#include <stdio.h>

void swap(int *x, int *y)
{
    int temp = *x;
    *x = *y;
    *y = temp;
}

int partition(int arr[], int LB, int UB)
{
    int pivot, start, end;
    pivot = arr[LB];
    start = LB;
    end = UB;

    if (start < end)
    {
        while (arr[start] <= pivot)
        {
            start++;
        }
        while (arr[end] > pivot)
        {
            end--;
        }
        if (start < end)
        {
            swap(&arr[start], &arr[end]);
        }
    }
    swap(&arr[LB], &arr[end]);
    return end;
}

void quickSort(int arr[], int LB, int UB)
{
    if (LB < UB)
    {
        int LOC = partition(arr, LB, UB);
        quickSort(arr, LB, LOC - 1);
        quickSort(arr, LOC + 1, UB);
    }
}

void display(int arr[], int size)
{
    for (int i = 0; i < size; i++)
    {
        printf("%d ", arr[i]);
    }
}

int main()
{
    int arr[10], size;

    printf("Enter the size of array: ");
    scanf("%d", &size);

    printf("Enter the %d elements in array: ", size);
    for (int i = 0; i < size; i++)
    {
        scanf("%d", &arr[i]);
    }

    printf("Quick Sort: ");
    display(arr, size);

    quickSort(arr, 0, size - 1);
    printf("\nAfter Quick Sorting: ");
    display(arr, size);

    return 0;
}