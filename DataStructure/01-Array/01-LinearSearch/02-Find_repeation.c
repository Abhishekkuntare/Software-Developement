
#include <stdio.h>

int main()
{
    // initializing variables
    int arr[10], size, i, item, count = 0, k = 0, loc = 0;

    // get size of array
    printf("Enter the size of array: ");
    scanf("%d", &size);

    // read the array
    printf("Enter the %d element in array: ", size);
    for (i = 0; i < size; i++)
    {
        scanf("%d", &arr[i]);
    }

    // print the array
    printf("\nInput Array: ");
    for (i = 0; i < size; i++)
    {
        printf("%d ", arr[i]);
    }

    // which no. you find in array
    printf("\nFind the number: ");
    scanf("%d", &item);

    for (i = 0; i < size; i++)
    {
        if (item == arr[i])
        {
            count++; // increment counter
            loc = k; // set value of loc
        }
        k++;
    }
    // summary
    if (loc == 0)
    {
        printf("Item not Found!");
    }
    else
    {
        printf("Found: %d \nRepeation: %d", loc, count);
    }

    return 0;
}