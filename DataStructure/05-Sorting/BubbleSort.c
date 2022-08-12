// #include <stdio.h>

// // print the array
// void Display(int arr[], int size)
// {
//     int i;
//     for (i = 0; i < size; i++)
//     {
//         printf("%d ", arr[i]);
//     }
//     printf("\n");
// }

// // main function
// int main()
// {

//     int arr[30], size;

//     // get the size of array by the user
//     printf("Enter the size of array: ");
//     scanf("%d", &size);

//     // get the elements from the user
//     printf("\nEnter the %d element in array: ", size);
//     for (int k = 0; k < size; k++)
//     {
//         scanf("%d", &arr[k]);
//     }

//     // call the function
//     printf("\nBefore bubble sort: ");
//     Display(arr, size);

//     int temp;

//     for (int i = 0; i < size - 1; i++)
//     {
//         for (int j = 0; j < size - i - 1; j++)
//         {
//             if (arr[j] > arr[j + 1])
//             {
//                 // swaping the elements who smaller
//                 temp = arr[j];
//                 arr[j] = arr[j + 1];
//                 arr[j + 1] = temp;
//             }
//         }
//     }

//     // again call function
//     printf("\nAfter bubble sort: ");
//     Display(arr, size);

//     return 0;
// }
