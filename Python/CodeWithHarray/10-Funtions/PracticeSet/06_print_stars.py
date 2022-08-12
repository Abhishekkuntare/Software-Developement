
#1 print in regular order 
# def stars_print(n):
#     for i in range(0,n):
#         print("$" *( i+1))

# n = int( input("Enter a quantity of starts: "))
# stars = stars_print(n)


#2 print in reverse order 
# def stars_print(n):
#     for i in range(n):
#         print("$" *( n-i))

# n = int( input("Enter a end of starts: "))
# stars = stars_print(n)

#3 print in reverse order taking input
def stars_print(m,n):
    for i in range(m,n):
        print("$" *( n-i))

m = int( input("Enter a start of starts: "))
n = int( input("Enter a end of starts: "))
stars = stars_print(m,n)


