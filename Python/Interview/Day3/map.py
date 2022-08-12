
# Python program to demonstrate working
# of map.
  
# Return double of n
def addition(n):
    return n + n
  
# We double all numbers using map()
numbers = (1, 2, 3, 4)
result = map(addition, numbers)
print(list(result))

#squre of number 
l1 = [1,3,4,65,]
def squareit(n):
    return n*n

res = map(squareit,l1)
print(list(res)) #if you not convert in to a list then it's give the map object 