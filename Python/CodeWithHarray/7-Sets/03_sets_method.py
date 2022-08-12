a =set()
a.add(3)
a.add(4)
a.add((6,7))

# a.add([3,2,5]) we do not add list in list because the list was  a unhashable and list will change but set will not change 

# a.add({3:4,6:7}) we do not add dict in set because dict will be change and set not change 

# print(len(a)) #prints the length of this set
# a.remove((6,7)) #removes the element in sets
# a.pop()
a.clear()
print(a)
