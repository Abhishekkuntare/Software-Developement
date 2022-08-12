#include <stdio.h>
int main()
{
    int html, css, js;
    float total;

    printf("Enter the marks of HTML : \n");
    scanf("%d", &html);
    printf("Enter the marks of CSS :\n ");
    scanf("%d", &css);
    printf("Enter the marks of JS : \n");
    scanf("%d", &js);

    total = (html + css + js) / 3;

    if (total <= 40 || html <= 33 || css <= 33 || js <= 33)
    {
        printf("You got %f you are fail", total);
    }
    else
    {
        printf("You got %f You are pass!", total);
    }
    return 0;
}