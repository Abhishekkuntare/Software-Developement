
// #include <stdio.h>

// int main()
// {

//     int arr[100], num, i, element, position;

//     // print the size of array
//     printf("Enter the size of array: ");
//     scanf("%d", &num);

//     // reading the elements
//     printf("Enter the %d element in array:\n", num);
//     for (i = 0; i < num; i++)
//     {
//         scanf("%d", &arr[i]);
//     }

//     // printing the elements
//     printf("Input array:\n");
//     for (i = 0; i < num; i++)
//     {
//         printf("%d ", arr[i]);
//     }

//     // inserting a number
//     printf("\nInsert any number: ");
//     scanf("%d", &element);

//     // take the position
//     printf("\nPosition of number: ");
//     scanf("%d", &position);

//     // find the size of array
//     i = num - 1;

//     // run a loop increment the arr
//     while (position <= i)
//     {
//         arr[i + 1] = arr[i];
//         i--;
//     }
//     arr[position] = element;
//     num++;

//     printf("\nAfter inserting array:");
//     for (i = 0; i < num; i++)
//     {
//         printf("%d ", arr[i]);
//     }
// }

// Index starts from 1
#include <stdio.h>

int main()
{

    int arr[100], item, position, i, size;

    printf("Enter the size of array: ");
    scanf("%d", &size);

    printf("Enter the %d element: ", size);
    for (i = 1; i <= size; i++)
    {
        scanf("%d", &arr[i]);
    }

    printf("\nInput Array: ");
    for (i = 1; i <= size; i++)
    {
        printf("%d ", arr[i]);
    }

    printf("\nInsert number: ");
    scanf("%d", &item);

    printf("\nPosition of number: ");
    scanf("%d", &position);

    while (position <= i)
    {
        arr[i + 1] = arr[i];
        i--;
    }
    arr[position] = item;
    size++;

    printf("\nAfter inserting array: ");
    for (i = 1; i <= size; i++)
    {
        printf("%d ", arr[i]);
    }

    return 0;
}