a =10# global variable

def f1():
    global a # now global is the 30 all over the program
# global b =10 # we are not initailze the globale value throws an error
    a= 30 # local variable 
    print(a)

def f2():
    print(a)

#if we remove the global key word then output is 30 10
f1()#30
f2()#30




