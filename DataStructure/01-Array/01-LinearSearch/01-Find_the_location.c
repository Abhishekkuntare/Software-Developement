#include <stdio.h>
int main()
{
    int DATA[] = {2, 5, 13, 81, 5, 13, 13, 11, 12};
    int LOC = 0, ITEM, k = 0;

    for (int i = 0; i <= DATA[i + 1]; i++)
    {
        printf("%d\t", DATA[i]);
    }
    printf("\n");

    printf("Find the number: ");
    scanf("%d", &ITEM);

    while (LOC == 0 && k <= 10)
    {
        if (ITEM == DATA[k])
        {
            LOC = k;
            // printf("%d is present in the location of %d", ITEM, LOC + 1);
        }
        k = k + 1;
    }

    if (LOC == 0)
    {
        printf("ITEM is not in array!");
    }

    else
    {
        printf("%d is present in the location of %d", ITEM, LOC + 1);
    }

    return 0;
}