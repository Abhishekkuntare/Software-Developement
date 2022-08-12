
def greatest_no(n1,n2,n3):
    if(n1>n2 and n1>n3):
        print(f"{n1} is greatest!")
    elif(n2>n1 and n2>n3):
        print(f"{n2} is greatest!")
    else:
        print(f"{n3} is greatest!")


n1 = int(input("Enter a n1: "))
n2 = int(input("Enter a n2: "))
n3 = int(input("Enter a n3: "))

greatest_no(n1,n2,n3)