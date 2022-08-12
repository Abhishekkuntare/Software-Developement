#include <stdio.h>

int main()
{
    // int i = 0, sum = 0, n;
    // printf("Enter any number");
    // scanf("%d", &n);

    // while (i <= n)
    // {
    //     sum += i;
    //     i++;
    // }
    // printf("The sum of  %d  =%d\n", n, sum);

    // int i, sum = 0, n;
    // printf("Enter any number :");
    // scanf("%d", &n);
    // for (i = 1; i <= n; i++)
    // {
    //     sum += i;
    // }
    // printf("The sum of %d = %d", n, sum);

    int i = 0, sum = 0, n;
    printf("Enter any number : ");
    scanf("%d", &n);

    do
    {
        sum += i;
        i++;
    } while (i <= n);
    printf("The value of  %d = %d", n, sum);
    return 0;
}