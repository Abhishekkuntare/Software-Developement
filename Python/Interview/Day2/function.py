
# # this is a default function we are passing any parameteres
# def add(): # define
#         a = int(input("Enter  a value: "))
#         b = int(input("Enter  b value: "))
#         c = a+b 
#         print(c)
# def calculation(a,b): 
#         print(a+b)

# #user define function
# a = int(input("enter a number: "))
# b= int(input("enter b value : "))
# calculation(3,3)
# add()

# predict the output 

# def check(a=0,b): 
#     print(a)
#     print(b)
# check(3,3)

def sum(x,y,z=10):
    print(x+y+z)

sum(3,3)#16
sum(3,3,4)#10
sum(3,3,1)#7