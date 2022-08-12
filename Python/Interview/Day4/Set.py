
s = {3,5,6,6,6}
print(s)

s={} #if set is empty then by default it's data type is dict
print(type(s))


s={()} # this is empty set
s=set() # this is empty set also
print(type(s))


s1 = {3,4,23,45} # it is unindex 
print(s1)
s1.add(39)
print(s1)   
s1.remove(3)
print(s1)

s1 = {1,"Abhsihe",33.3} # it is heterogenuos means collction of different values
print(s1)

import sys
print(sys.getsizeof(s1))

l1 = [1,3,4]
t1 = (1,3,4)
print(id(l1)) # give's the address
print(id(t1))