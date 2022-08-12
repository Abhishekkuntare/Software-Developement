try:
    a = int(input("Enter a number: "))
    c = 1/a
    print(c)
except ValueError as e:
    print("Please enter a valid value!")
except ZeroDivisionError as e:
    print("Make sure you are not dividing by 0")

print("Thanks for use this code!")


    