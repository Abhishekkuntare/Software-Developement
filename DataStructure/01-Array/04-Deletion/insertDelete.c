// #include <stdio.h>

// int main()
// {
//     int arr[100], i, element, num, position, delPosition;

//     printf("Enter the size of array: ");
//     scanf("%d", &num);

//     printf("Enter the %d elements in array: ", num);
//     for (i = 0; i < num; i++)
//     {
//         scanf("%d", &arr[i]);
//     }

//     printf("\nInput array: \n");
//     for (i = 0; i < num; i++)
//     {
//         printf("%d ", arr[i]);
//     }

//     printf("\nInsert the no: ");
//     scanf("%d", &element);

//     printf("\nPosition of the no: ");
//     scanf("%d", &position);

//     i = num - 1;

//     while (position <= i)
//     {
//         arr[i + 1] = arr[i];
//         i--;
//     }
//     arr[position] = element;
//     num++;

//     printf("\nAfter inserting array: ");
//     for (i = 0; i < num; i++)
//     {
//         printf("%d ", arr[i]);
//     }

//     printf("\nDelete position of no: ");
//     scanf("%d", &delPosition);

//     i = delPosition + 1;

//     while (i <= num)
//     {
//         arr[i - 1] = arr[i];
//         i++;
//     }
//     num--;

//     printf("\nAfter Deleting array: ");
//     for (i = 0; i < num; i++)
//     {
//         printf("%d ", arr[i]);
//     }

//     return 0;
// }

// index starts from 1
#include <stdio.h>

int main()
{
    int arr[100], i, item, size, position, delPosition;

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

    printf("\nInsert a number: ");
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

    printf("\nPosition of Delete number: ");
    scanf("%d", &delPosition);

    i = delPosition + 1;

    while (i <= size)
    {
        arr[i - 1] = arr[i];
        i++;
    }
    size--;

    printf("\nAfter inserting and deletion array: \n");
    for (i = 1; i <= size; i++)
    {
        printf("%d ", arr[i]);
    }
    return 0;
}
