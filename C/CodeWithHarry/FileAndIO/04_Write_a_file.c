#include <stdio.h>

int main()
{
    FILE *ptr;
    char name[20];
    int number;

    ptr = fopen("write.txt", "w");

    printf("Enter your name :");
    scanf("%s", name);
    printf("Enter your number :");
    scanf("%d", &number);

    fprintf(ptr, "Name :- %s\n", name);
    fprintf(ptr, "Number :- %d\n", number);
    fclose(ptr);
    return 0;
}