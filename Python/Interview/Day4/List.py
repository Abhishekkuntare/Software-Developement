
#create a list of name of student
l = ["Abhi","Ani","Saharsh"]
print(l)
for i in l: 
    print(i)

#create a list of numbers
l1= [1,3,4,5,7]
def display(l1):
    return l1

print(list(map(display,l1)))

#list is collection of differnat data types
mylist = [1,"abhishek",1.3,True]
def diffDT(mylist):
    return mylist

print(list(map(diffDT,mylist)))# first parameter is funciton and second one is sequence 

#append function is use to append data at the end
mylist.append("Hello fromo append")

#insert function is use insert data at the index position
mylist.insert(1,"Hellof from insert")
print(list(map(diffDT,mylist)))

#extend adds the specified list elements (or any iterable) to the end of the current list.
mylist.extend([200,499])
print(list(map(diffDT,mylist)))

#clear 
# mylist.clear()
# print(list(map(diffDT,mylist)))


#count
print(mylist.count(200) )

#index
print(mylist.index(1))

#pop the end of the list 
print(mylist.pop()) 

# at the index of 3 will be deleted in list
print(mylist.pop(3))

# print(mylist.remove()) # delete data accounding to list values

print(mylist.reverse())

# print(mylist.sort()) #sort data in asscending manner

#print the reverse sorted list
lis = [13,6,77]
lis.sort(reverse=True)
print(lis)


#delete
del lis[1] #at the index 1 deleted 
print(lis)

# del mylist # all data delete from the list
# print(mylist)

#copy
l3 =[1,4]
l4 = l3.copy()
print(l4)

#min and max
print(min(l3))
print(max(l3))

#replace the data that's why list is mutable
l3[0]=3
l3[1]=6
print(l3)
