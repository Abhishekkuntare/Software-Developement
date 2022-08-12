#include <stdio.h>
#include <string.h>

typedef struct info
{
    int rollno;
    float fees;
    char name[30];
} info;

int main()
{
    info bio;

    info *ptr;
    ptr = &bio;

    ptr->rollno = 43;
    ptr->fees = 12.21;
    strcpy(ptr->name, "Abhishek");
    printf("%s\n%d\n%.2f\n", bio.name, bio.rollno, bio.fees);

    // from user input
    // printf("Enter your name :");
    // gets(bio.name);
    // printf("Enter your rollNo :");
    // scanf("%d", &bio.rollno);
    // printf("Enter your fees :");
    // scanf("%f", &bio.fees);

    return 0;
}