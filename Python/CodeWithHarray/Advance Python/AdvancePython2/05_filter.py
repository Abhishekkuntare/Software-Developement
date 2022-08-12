def greater_than_5(num):
    if(num > 5):
        return True
    else:
        return False

def divisibleByTwo(num):
    
    if(num%2==0):
            print("Even number")
    else:
        print("Odd number")

num1 = int(input("Enter num1: "))
num2 = int(input("Enter num2: "))
num3 = int(input("Enter num3: "))
num4 = int(input("Enter num4: "))
num5 = int(input("Enter num5: "))
list2 = [num1,num2,num3,num4,num5]
a = list(filter(divisibleByTwo,list2))

# l = [12,3,45,6,7,5,1,2,3,3,54]

# print(list(filter(greater_than_5,l)))

# g10 = lambda num: num > 10
# print(list(filter(g10,l)))