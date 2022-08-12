
from functools import reduce

sum = lambda num1,num2:num1 + num2
l = [1,2,4,5]
val = reduce(sum,l)
print(val)