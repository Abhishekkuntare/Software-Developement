#include <stdio.h>
int main()
{
    int math, phy, chem, eng, code;
    int total;

    printf("Enter the marks of Maths:\n");
    scanf("%d", &math);
    printf("Enter the marks of Phy:\n");
    scanf("%d", &phy);
    printf("Enter the marks of Chem:\n");
    scanf("%d", &chem);
    printf("Enter the marks of Eng:\n");
    scanf("%d", &eng);
    printf("Enter the marks of Code:\n");
    scanf("%d", &code);
    total = (math + phy + chem + eng + code) / 5;

    if (total >= 90 && total <= 100)
    {
        printf("You got A Grade! %d", total);
    }
    else if (total >= 80 && total <= 90)
    {
        printf("You got B Grade!%d", total);
    }
    else if (total >= 70 && total <= 80)
    {
        printf("You got C Grade!%d", total);
    }
    else if (total >= 60 && total <= 70)
    {
        printf("You got D Grade!%d", total);
    }
    else if (total >= 50 && total <= 60)
    {
        printf("You got F Grade!%d", total);
    }
    else
    {
        printf("Sorry you are fail better luck next time!%d ", total);
    }
    return 0;
}