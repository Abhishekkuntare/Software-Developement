#include <stdio.h>

struct LoginForm
{
    char name[20];
    char email[20];
    int number;
};

int main()
{
    struct LoginForm LF;
    LF.name;
    LF.email;
    LF.number;

    printf("Enter Your Name: ");
    gets(LF.name);

    printf("Enter Your Email: ");
    gets(LF.email);

    printf("Enter Your Phone Number: ");
    scanf("%d", &LF.number);

    printf("Check your details!\n");
    puts(LF.name);
    puts(LF.email);
    printf("%d\n", LF.number);
    return 0;
}