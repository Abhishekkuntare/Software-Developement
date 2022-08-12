#include <stdio.h>

void display(int arr[], int size)
{
    int i;
    for (i = 0; i < size; i++)
        printf("%d ", arr[i]);
    printf("\n");
}

int main()
{
    int array[] = {8, 6, 4, 20, 24, 2, 10, 12};
    int size = sizeof(array) / sizeof(array[0]);

    printf("Before Insertion sort: \n");
    display(array, size);

    int i, key, j;
    for (i = 1; i < size; i++)
    {
        key = array[i];
        j = i - 1;

        while (j >= 0 && array[j] > key)
        {
            array[j + 1] = array[j];
            j--;
        }

        array[j + 1] = key;
    }

    printf("After Insertion sort: \n");
    display(array, size);

    return 0;
}
// Time Complexity : O(n^2)
// Auxiliary Space : O(1)