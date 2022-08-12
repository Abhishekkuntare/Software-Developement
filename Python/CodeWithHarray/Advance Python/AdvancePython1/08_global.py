a = 18 #Global varibale

def fun():

    global a
    print(a)
    a = 3 #Local variable if global variable is not used
    print(a)

fun()
print(a)