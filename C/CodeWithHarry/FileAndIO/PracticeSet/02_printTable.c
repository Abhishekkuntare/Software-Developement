#include <stdio.h>

int main()
{
    int num;
    FILE *ptr;
    ptr = fopen("table.txt", "w");

    printf("Enter the table of number you want :");
    scanf("%d", &num);

    for (int i = 0; i < 10; i++)
    {
        fprintf(ptr, "%d * %d = %d\n", num, i + 1, num * (i + 1));
    }

    return 0;
}