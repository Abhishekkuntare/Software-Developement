#include <stdio.h>

void main()
{
    int num1;
    int num2 = 2;
    FILE *ptr1;
    FILE *ptr2;

    ptr1 = fopen("read.txt", "r");
    ptr2 = fopen("write.txt", "w");

    fscanf(ptr1, "%d", &num1);

    fprintf(ptr2, "%d *%d = %d", num1, num2, num1 * num2);
    fclose(ptr1);
}