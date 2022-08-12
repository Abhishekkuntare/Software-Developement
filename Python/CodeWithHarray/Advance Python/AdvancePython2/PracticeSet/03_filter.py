def divisibleFive(list):
    if(list%5==0):
        return True
    else:
        return False

divisibleTwo = lambda list : list%2==0

list1 = [1,2,4,5,10,15,20,6,78]

a = list(filter(divisibleFive,list1))
print(a)

b = list(filter(divisibleTwo,list1))
print(b)