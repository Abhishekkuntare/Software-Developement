#include <stdio.h>

int main()
{

    int num1, num2, num3;
    FILE *ptr;
    ptr = fopen("01_read_three.txt", "r");

    fscanf(ptr, "%d  %d %d", &num1, &num2, &num3);
    printf("%d\n%d\n%d\n", num1, num2, num3);
    fclose(ptr);

    return 0;
}