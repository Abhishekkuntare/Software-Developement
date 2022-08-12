#include <stdio.h>

int main()
{
    int arr[50], elements;

    printf("Enter the size of the array: ");
    scanf("%d", &elements);

    printf("Enter the %d elements in array: ", elements);

    for (int i = 0; i < elements; i++)
    {
        scanf("%d\n", &arr[i]);
    }

    for (int i = 0; i < elements; i++)
    {
        if (10 > arr[i])
        {
            printf("10 is greater!");
            break;
        }
    }

    return 0;
}