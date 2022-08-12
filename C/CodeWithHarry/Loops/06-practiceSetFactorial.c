#include <stdio.h>
int main()
{

    // for loop state ment

    // int i = 1, n, factorial = 1;
    // printf("Enter any number to finding a factorial :");
    // scanf("%d", &n);

    // for (i; i <= n; i++)
    // {
    //     factorial *= i;
    // }
    // printf("The factorial of %d = %d", n, factorial);

    // while loop state ment

    // int i = 15, n, factorial = 1;
    // printf("Enter any number : ");
    // scanf("%d", &n);
    // while (i <= n)
    // {
    //     factorial *= i;
    //     i++;
    // }
    // printf("The factorial %d = %d", n, factorial);

    // do while loop state ment/
    int i = 1, factoriral = 1, n;
    printf("Enter any number to find factorial :");
    scanf("%d", &n);

    do
    {
        factoriral *= i;
        i++;
    } while (i <= n);
    printf("The factorial of %d = %d", n, factoriral);

    return 0;
}