try:
    i = int(input("Enter a number: "))
    c = 1/i
    print(c)
except Exception as e:
    print(e)
    exit()

finally:
    print("I did this!")

print("Thanks for using the program!")