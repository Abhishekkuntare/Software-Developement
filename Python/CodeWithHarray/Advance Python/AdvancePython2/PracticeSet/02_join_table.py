
n = int(input("Enter a number: "))
l = [str(i*n) for i in range(1,11)]

print(l)
verticalTable = "\n".join(l)
print(verticalTable)