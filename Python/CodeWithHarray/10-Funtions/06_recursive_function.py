
def recursive(n):
    if(n ==1 or n==0):
        return 1

    return n * recursive (n-1)

n  =int(input("Insert a number: "))
f = recursive(n)
print(f)