#include <stdio.h>

int main()
{
    char str[30];
    printf("Enter your full name :");
    gets(str); // Gives the whole name with spaceses
    printf("Hey What's up! %s", str);
}