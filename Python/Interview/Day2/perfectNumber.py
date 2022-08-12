

number = eval(input("Enter the number: "))
mul =1;
for i in range (1,number):
    if(number%i==0):
        mul = mul*i 
    
if(number==mul):
    print("number is perfect")
else:
    print("number is not perfect")