// #include <stdio.h>

// void morning();
// void game(); // Creating a function game
// void see();

// int main()
// {
//     printf(" Hello , Good morning !\n");
//     morning();
//     printf("Which game are you playing?\n");
//     game(); //'calling a functionnnn
//     printf("Ok, CarryOn!\n");
//     see();
//     return 0;
// }

// // Data store in fucntion
// void morning()
// {
//     printf("Very Good morning!\n");
// }
// void game()
// {
//     printf("I am playing a fortnight new season 10!\n");
// }

// void see()
// {
//     printf("Ok, are you playing with me!\n");
// }

#include <stdio.h>

void game()
{

    printf("Loading...... The Epic Game.\n");
}

void game_loading(char name[])
{
    name[100];
    printf("Enter the name of Game: ");
    scanf("%c", &name[100]);

    printf("Starting the %c", name[100]);
}

void main()

{
    char name[100];
    game();
    game_loading(name);
}