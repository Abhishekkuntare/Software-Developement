
a =int(input("Enter the value of a: "))
b =int(input("Enter the value of b: "))

try:
    if(a == 0 and b==0):
        print("Not defined!")
    else:
        print(a/b)
except:
    print("Infinte")