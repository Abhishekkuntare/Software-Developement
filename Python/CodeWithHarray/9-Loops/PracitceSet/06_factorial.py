
num = int(input("Enter a number :\n"))
factorial = 1
for i in range(1, num+1):
    factorial = factorial * i
print(f"factorial of {num} is {factorial}")