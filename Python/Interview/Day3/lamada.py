
s = lambda n:n*n
print("Square of ", s(4))

#squae of numbers 

for i in range(1,11):
    # print("The square {} is: {}".format(i,s(i)))
    print(f"the square if: ",i,(s(i)))

# #apply lamda on list
# l1 =[1,2,4,5]
# l2 = list(map(lambda n:n*n,l1))
# print(l2)

# use two array with lamda
# l1 =[1,2,4,5]
# l2 =[1,2,4,5]
# l3 = list(map(lambda x,y:x+y,l1,l2))
# print(l3)

# use two array with lamda
l1 =[1,2,4,5,12,11] # ignore the additionl data in  12 and 11 size of l2 elem get by l1 only
l2 =[1,2,4,5]
l3 = list(map(lambda x,y:x+y,l1,l2))
print(l3)
