#include <stdio.h>

void table(int *arr, int num, int n)
{
    for (int i = 0; i < n; i++)
    {
        arr[i] = num * (i + 1);
    }
    for (int i = 0; i < n; i++)
    {
        printf("%d * %d = %d\n", num, i + 1, arr[i]);
    }
    printf("\n");
}
int main()
{
    int m, n;
    int mytabel[m][n];

    printf("Enter the Multiplication table you want ? : ");
    scanf("%d", &m);
    printf("How much range for table  %d : ", m);
    scanf("%d", &n);
    table(mytabel[m], m, n);

    // int mulTable[3][10];
    // for (int i = 0; i < 10; i++)
    // {
    //     mulTable[0][i] = 9 * (i + 1);
    // }
    // for (int i = 0; i < 10; i++)
    // {
    //     printf("9*%d = %d\n", i + 1, mulTable[0][i]);
    // }

    // printf("\n");

    // for (int i = 0; i < 10; i++)
    // {
    //     mulTable[1][i] = 2 * (i + 1);
    // }
    // for (int i = 0; i < 10; i++)
    // {
    //     printf("2*%d = %d\n", i + 1, mulTable[1][i]);
    // }
    // printf("\n");

    // for (int i = 0; i < 10; i++)
    // {
    //     mulTable[2][i] = 5 * (i + 1);
    // }
    // for (int i = 0; i < 10; i++)
    // {
    //     printf("5*%d = %d\n", i + 1, mulTable[2][i]);
    // }
    return 0;
}