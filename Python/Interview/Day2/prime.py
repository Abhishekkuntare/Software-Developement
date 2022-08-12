number = int(input("Enter the number: "))
flag =0;
for i in range (2,number):
    if(number%i==0):
      flag =1;
    
if(flag==1):
    print("number not prime")
else:
    print("number is  prime")