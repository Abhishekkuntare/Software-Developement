#include <stdio.h>
int main()
{
    int num;
    printf("Enter a num:");
    scanf("%d", &num);

    if (num == 10)
    {
        printf("You are a 10 number score !");
    }
    else if (num == 30)
    {
        printf("You got a 30 number ");
    }
    else if (num == 50)
    {
        printf("Exceelent you got a 50 score in !");
    }
    else
    {
        printf("Sorry, You are fail !");
    }
    return 0;
}