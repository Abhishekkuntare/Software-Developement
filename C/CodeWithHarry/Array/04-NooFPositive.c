
#include <stdio.h>

// positive number
int positiveNumber(int *arr, int n)
{
    int count_positive = 0;
    for (int i = 0; i < n; i++)
    {
        if (arr[i] > 0)
        {
            count_positive++;
        }
    }
    return count_positive;
}

// negative Number
int negativeNumber(int *arr, int n)
{
    int count_negative = 0;
    for (int i = 0; i < n; i++)
    {
        if (arr[i] < 0)
        {
            count_negative++;
        }
    }
    return count_negative;
}

// zero
int zero(int *arr, int n)
{
    int count_zero = 0;
    for (int i = 0; i < n; i++)
    {
        if (arr[i] == 0)
        {
            count_zero++;
        }
    }
    return count_zero;
}

// printArray
void printArray(int *arr, int n)
{
    printf("Array :");
    for (int i = 0; i < n; i++)
    {
        printf("%d,", arr[i]);
    }
    printf("\n");
}

// main
int main()
{
    int arr[] = {3, 4, 0, 0, 2, -8, 19, -29};
    int n;
    n = sizeof(arr) / sizeof(arr[0]);

    printArray(arr, n);

    printf("POSITIVE NUMBER : %d\n", positiveNumber(arr, n));

    printf("NEGATIVE NUMBER : %d\n", negativeNumber(arr, n));

    printf("ZEROS : %d\n", zero(arr, n));

    return 0;
}