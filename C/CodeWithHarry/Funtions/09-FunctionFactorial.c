#include <stdio.h>
int factotrial(int x);
int main()
{
    int ans;
    printf("Enter any number : ");
    scanf("%d", &ans);

    printf("The factotrial of %d  = %d", ans, factotrial(ans));

    return 0;
}

int factotrial(int x)
{
    if (x == 1 || x == 0)
    {
        return 1;
    }
    else
    {
        return x * factotrial(x - 1);
    }
}