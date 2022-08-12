def inches_to_cm(n):
    formula = n *  2.54
    return formula

n =int( input("Enter a number :"))
inchesToCm = inches_to_cm(n)
print(f"{n} inches is {inchesToCm}")

