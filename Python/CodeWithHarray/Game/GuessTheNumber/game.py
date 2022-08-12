

import random

random = random.randint(1,100)
print(random)

userGuess = None
noOfGuess = 0

while(userGuess != random):

    noOfGuess +=1
    userGuess = int(input("Enter your guess:- "))

    if(userGuess == random):
        print("You guess it right!")

    elif(userGuess < random):
        print("Greater number please!")

    elif(userGuess > random):
        print("Lower number please!")

    if(userGuess > 100):
        print("Please enter a number between 1 to 100!")
    

print(f"You guessed in {noOfGuess} guess!")

with open("F:\\Software Developer\\Abhishek's Code\\Python\\CodeWithHarray\\Game\\GuessTheNumber\\guess.txt", "r") as f:
    hiscore = int(f.read(noOfGuess))


if(noOfGuess<hiscore):
    print("You just break the hiscore!")
    with open("F:\\Software Developer\\Abhishek's Code\\Python\\CodeWithHarray\\Game\\GuessTheNumber\\guess.txt", "w") as f: 
        f.write(str(noOfGuess))
