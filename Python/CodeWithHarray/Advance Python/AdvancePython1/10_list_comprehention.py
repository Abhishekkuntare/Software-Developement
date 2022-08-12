
list1 = [1,2,3,45,6,7,8,10,5,4,3]
list2 = [4,5,6,7,1,2]

# b= []
# for item in list1:
#     if(item %2==0):
#         b.append(item)
# print(b)

b =[i for i in list1 if i%2==0]
print(b)
c = [i for i in list2 if i>3]
print(c)
