
import functools

l1 = [2,4,4]
print(functools.reduce(lambda x,y:x+y,l1))