
import random

def game(com,you):
    if(com == you):
        return 0

    if(you == 's' and com =='w'):
        return 1
    elif(you == 'w' and com == 's'):
        return -1
    elif(you == 'g' and com == 's'):
        return 1
    elif(you == 's' and com == 'g'):
        return -1
    elif(you =='w' and com == 'g'):
        return 1
    elif(you =='g' and com == 'w'):
        return -1


print("Computer Choose : Snake(s) , Water(w) , Gun(g) ?")
randNo = random.randint(1,3)

if(randNo ==1):
    com = 's'
elif(randNo ==2):
    com = 'w'
elif(randNo == 3):
    com ='g'

you = (input("Your turn : Snake(s) , Water(w) , Gun(g):- "))
print(f"you choose {you} and com choose {com}")


a = game(com,you)
if (a == 0):
    print("Game Draw!")
elif a == 1:
    print("You Win!")
else:
    print("You Lose!")


