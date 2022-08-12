
num = int(input("Enter a number for print the table: "))

try:
    table = [num*i for i in range(1,11)]
    print(table)
    with open("table.txt","w") as f:
        f.write(str(table))
except FileNotFoundError:
    print("File not found!")

