#include <stdio.h>
#include <string.h>

typedef struct bank
{
    char name[100];
    int phone_number;
    char type[10];
    int acc_no;
    int ifsc_code;
    float money;

} bank;

void details(char de[], char yes[], char no[])
{
    bank info;
    char *ptr = de;
    char *ptr1 = yes;
    char *ptr2 = no;

    printf("Enter you Name :");
    gets(info.name);

    printf("Which Account you want ex.saving,general,student :");
    gets(info.type);

    printf("Enter your Phone Number :");
    scanf("%d", &info.phone_number);

    printf("Enter your Account Number :");
    scanf("%d", &info.acc_no);

    printf("Enter your IFSC :");
    scanf("%d", &info.ifsc_code);

    printf("Enter your ammount :");
    scanf("%f", &info.money);

    printf("Your Account Created Successfully !");
    printf("\n");

    printf("Hello! %s", info.name);
    printf("\n");

    printf("Can you check your profile ?:");
    scanf("%d", &de);

    if (*ptr == *ptr1)
    {

        printf("%s\n%s\n%d\n%d\n%d\n%f\n", info.name, info.type, info.phone_number, info.acc_no, info.ifsc_code, info.money);
    }
    else if (*ptr == *ptr2)
    {
        printf("Ok! Have a good day sir.");
    }
}

int main()
{
    bank info;

    char de[1000];
    char yes[10];
    char no[10];

    char *ptr = de;
    char *ptr1 = yes;
    char *ptr2 = no;

    printf("Create New Account SBI");
    printf("\n");

    details(de, yes, no);

    return 0;
}