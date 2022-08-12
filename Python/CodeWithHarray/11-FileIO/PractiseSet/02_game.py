

# def game(n):
#         return n

# n = int(input("Your Score: "))
# score = game(n)

# with  open("F:\\Software Developer\\Abhishek's Code\\Python\\CodeWithHarray\\11-FileIO\\PractiseSet\\hiscore.txt","r" ) as f:
#     hiscore = (f.read())

# if(hiscore ==""):
#     print(f"Adding a new hiscore {score}")
#     with  open("F:\\Software Developer\\Abhishek's Code\\Python\\CodeWithHarray\\11-FileIO\\PractiseSet\\hiscore.txt","w" ) as f:
#         f.write(str(score))

# elif(score>int(hiscore)):
#     print(f"You score {score} is breaks the hiscore {hiscore}")
#     with  open("F:\\Software Developer\\Abhishek's Code\\Python\\CodeWithHarray\\11-FileIO\\PractiseSet\\hiscore.txt","w" ) as f:
#         f.write(str(score))

# else:
#   print(f"You score {score} is not breaks the hiscore {hiscore}")


def game(n):
    return n


n = int(input("Your hiscore: "))
score = game(n)

with  open("F:\\Software Developer\\Abhishek's Code\\Python\\CodeWithHarray\\11-FileIO\\PractiseSet\\hiscore.txt","r" ) as f:
    hiscore = f.read(score)

if(hiscore ==""):
    print(f"Adding the new Score: {score}")
    with  open("F:\\Software Developer\\Abhishek's Code\\Python\\CodeWithHarray\\11-FileIO\\PractiseSet\\hiscore.txt","w" ) as f:
        f.write(str(score))

elif(score>int(hiscore)):
    print(f"Your score {score} is breaks the hiscore: {hiscore}")
    with  open("F:\\Software Developer\\Abhishek's Code\\Python\\CodeWithHarray\\11-FileIO\\PractiseSet\\hiscore.txt","w" ) as f:
         f.write(str(score))

else:
     print(f"Your score {score} is not breaks the hiscore: {hiscore}")


