#include <stdio.h>

typedef struct date
{
    int year;
    int month;
    int date;
} date;

void display(date d)
{
    printf("The date is %d/%d/%d\n", d.year, d.month, d.date);
}

int compare(date d1, date d2)
{
    if (d1.year > d2.year)
    {
        return 1;
    }
    if (d1.year < d2.year)
    {
        return -1;
    }
    if (d1.month > d2.month)
    {
        return 1;
    }
    if (d1.month < d2.month)
    {
        return -1;
    }
    if (d1.date > d2.date)
    {
        return 1;
    }
    if (d1.date < d2.date)
    {
        return -1;
    }
    return 0;
}

int main()
{
    date d1 = {25, 11, 20};
    date d2 = {25, 10, 20};
    display(d1);
    display(d2);

    int a = compare(d1, d2);
    printf("Date comparision fucnion retunrn %d", a);
    return 0;
}