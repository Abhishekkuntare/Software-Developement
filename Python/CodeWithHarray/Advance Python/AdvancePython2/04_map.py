def square(num):
    return num * num
l = [3,4,5]
print(list(map(square,l)))

def cube(num):
    return num **3

num1 = int(input("Enter a number1: "))
num2 = int(input("Enter a number2: "))
num3 = int(input("Enter a number3: "))
num4 = int(input("Enter a number:4 "))
num5 = int(input("Enter a number5: "))
l = [num1 ,num2,num3,num4,num5]
a =list(map(cube,l))
print(a)


fourth = lambda num: num **4
num = int(input("Enter a number to find a fourth: "))
b = fourth(num)
print(b)







