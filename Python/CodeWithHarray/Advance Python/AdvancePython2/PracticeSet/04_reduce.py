
from functools import reduce

l1 = [1,20,5,6,47,23,24]

a = reduce(max,l1 ) #here max is a inbuild function of python
print(a)

b = reduce(min,l1) #here min was inbuild funtion of python
print(b)