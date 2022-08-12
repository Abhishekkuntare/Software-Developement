
# if we not give product initial value then factorial is always zero 
def factorial(n):
    product =1
    for i in range(0,n):
        product = product * (i+1)
    return product

n = int(input("Enter a number :"))
fact = factorial(n)
print(fact)