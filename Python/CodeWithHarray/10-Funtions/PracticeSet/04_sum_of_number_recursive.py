
def recursive(n):
    if(n==0):
        return 0
    else:
        return n + recursive(n-1)

n = int(input("Enter a number: "))
sum_of_number = recursive(n)
print(f"factorial of {n} is {sum_of_number}")