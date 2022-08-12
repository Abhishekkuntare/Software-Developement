
# a = 10
# for val in range(a):
#     print(val)  

# print("\n")

# for j in range(2,10,2):
#     print(j)

# print("\n")

# a = eval(input("Enter the number: "))
# for i in range(1,11):
#     print(i*a)
# print("\n")

# for i in range(10,0,-1): # 10 to 0 is a range and -1 is the itration
#     print(i)

sum  =0
for i in range(1,10):
    sum+=i
print(sum)

fact  =1
number = eval(input('Enter the number: '))
for i in range(1,number+1):
    fact =fact*i;
print(fact)