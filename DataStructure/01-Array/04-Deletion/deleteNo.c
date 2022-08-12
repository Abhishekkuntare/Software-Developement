
#include <stdio.h>

int main()

{

    int arr[100], i, num, position;

    printf("Enter the size of array: ");
    scanf("%d", &num);

    printf("Enter the %d elements in array: ", num);
    for (i = 0; i < num; i++)
    {
        scanf("%d", &arr[i]);
    }

    printf("\nInput array: \n");
    for (i = 0; i < num; i++)
    {
        printf("%d ", arr[i]);
    }

    printf("\nDeleting position no: ");
    scanf("%d", &position);

    i = position + 1;
    while (i <= num)
    {
        arr[i - 1] = arr[i];
        i++;
    }
    num--;

    printf("\nAfter Deleting the array element: ");
    for (i = 0; i < num; i++)
    {
        printf("%d ", arr[i]);
    }
    return 0;
}

// Index starts from 1

#include <stdio.h>

int main()
{
    int arr[100], i, size, position;
    printf("Enter the size of array: ");
    scanf("%d", &size);

    printf("Enter the %d elements in array: ", size);
    for (i = 1; i <= size; i++)
    {
        scanf("%d", &arr[i]);
    }

    printf("\nInput array: \n");
    for (i = 1; i <= size; i++)
    {
        printf("%d ", arr[i]);
    }

    printf("\nPosition of Delete no: ");
    scanf("%d", &position);

    i = position + 1;

    while (i <= size)
    {
        arr[i - 1] = arr[i];
        i++;
    }
    size--;

    printf("\nAfter Deletion array: \n");
    for (i = 1; i <= size; i++)
    {
        printf("%d ", arr[i]);
    }

    return 0;
}