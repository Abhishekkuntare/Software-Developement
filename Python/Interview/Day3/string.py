
a = "abhishek"
b = 'Pravin'
c = '''I'am learing a python '''
print(a,b,c)

print(a[-1]) #their is negative indexing is allow in python 


#index slizing 
print(a[0:4]) #start and end point 
print(a[0:])#only start point it will get by default end value 
print(a[:4])
print(a[::2]) #print(a[0:8:2])
print(a[:0:-1])

name ="python"
for i in name:
    print(i)

print(len(name))
print(type(name))

#print string using len function
for i in range(len(name)):
    print(name[i])

#wap to count total no. of vowels in a string 
# string ="javaScript"

# for ch in string:
#     if(ch=='a' or ch=='b' or ch==)


#wap stirng is immutable then explain with example
# name ="aniket"
# name[3]='j'
# print(name) #throws the error because if we declare an string then we can not update and change it 


#index
name="john is my friend"
print(name.index('j'))
print(name.strip())#remove the blank spaces
print(name.isupper())
print(name.islower())
print(name.lower())
print(name.upper())
print(name.isalnum())
print(name.isalpha())
print(name.split())