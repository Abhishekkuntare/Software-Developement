#include <stdio.h>

void printArry(int ptr[], int n)
{
    for (int i = 0; i < n; i++)
    {
        printf("The value of number %d: %d\n", i + 1, ptr[i]);
    }
    ptr[1] = 10000; // this will change cause we passing the addreess in arr
}

int main()
{
    int arr[] = {11, 12, 14, 15, 15, 16, 16};
    printArry(arr, 7);
    printf("the value index 1 %d", arr[1]);
    return 0;
}