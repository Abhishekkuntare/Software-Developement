
i = 1
while(i<10):
    print(i)
    i+=1


#print sum of digit in a given number 
n = int(input("Enter any number: "))
sum  = 0
while(n>0):
    t =n%10
    sum=sum+t
    n =n//10
print(sum)