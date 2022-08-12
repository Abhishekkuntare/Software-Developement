#include <stdio.h>
#include <string.h>

int main()
{
    char source[] = "Abhishek";
    char target[40];
    strcpy(target, source);
    printf("Now the target gets value of source %s", target);

    return 0;
}