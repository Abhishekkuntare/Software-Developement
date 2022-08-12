#include <stdio.h>

void main()
{
    FILE *ptr;

    char name[100];
    char email[39];
    char password[99];

    ptr = fopen("Register.txt", "w");

    printf("Enter your Name :");
    gets(name);

    printf("Enter your Email :");
    gets(email);

    printf("Password :");
    gets(password);

    fprintf(ptr, "Name:- %s\n", name);
    fprintf(ptr, "Email:- %s\n", email);
    fprintf(ptr, "Password:- %s\n", password);

    fclose(ptr);
}