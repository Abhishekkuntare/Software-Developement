#include <stdio.h>

void TowerOfHanoi(int n, char BEG, char MID, char END)
{
    if (n == 0)
        return;

    TowerOfHanoi(n - 1, BEG, END, MID);
    printf("Move from %c to %c \n", BEG, END);
    TowerOfHanoi(n - 1, MID, BEG, END);
}

int main()
{
    int n = 4;
    TowerOfHanoi(n, 'A', 'B', 'C');
    return 0;
}