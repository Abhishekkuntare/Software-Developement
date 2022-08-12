

from array import *#* means import all from array 

l1 = [1,13,4,5,"abhsehk"]#this is list is a heterogenious

# i and I for Interger
a = array('i',[3,4,5,56,6,-1]); # small i takes both -ve and +ve also
# a = array('I',[3,4,5,56,6,-1]); # Capital I takes only positiv integer # it will throw an errror
print(a)

# f for float
a =array('f',[3,3.6,3.4,5.1,-1])
print(a)

# d for float
a =array('d',[3,3.6,3.4,5.1,-1])
print(a)

# # c for float
# a =array('c',[a,b,e])
# print(a)


#count
a =array('i',[1,24,5])
print(a.count(3))

a.insert(2,20)
print(a)
a.append(30)
print(a)
a.extend(30)
print(a)
a.remove()
print(a)

a.reverse()
print(a)
a.pop()
print(a)
a.insert(43)
print(a)