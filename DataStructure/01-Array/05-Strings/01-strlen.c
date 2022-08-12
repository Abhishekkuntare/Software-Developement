#include <stdio.h>
#include <string.h>

int main()
{
    char name[100];
    int length;

    printf("Enter your name: ");
    scanf("%s", name);

    length = strlen(name);
    printf("The length of %s is: %d", name, length);

    return 0;
}