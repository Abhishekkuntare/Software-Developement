#include <stdio.h>
#include <string.h>

void reverse_string(char s[])
{
    int length = strlen(s);
    while (length--)
    {
        printf("%s", s);
        break;
    }
}

int main()
{
    char destination[10];
    char source[10];

    printf("Enter the destination: ");
    scanf("%s", &destination);
    printf("Enter the source: ");
    scanf("%s", &source);

    printf("Concatinate: %s", strcat(destination, source)); // strcat()
    printf("\nCopying: %s", strcpy(source, destination));   // strcpy()
    printf("\nLength of String: %d", strlen(destination));  // strlen()
    printf("\nReverse: %s", strrev(destination));           // strrev()
    printf("\n");
    reverse_string(destination);
    return 0;
}