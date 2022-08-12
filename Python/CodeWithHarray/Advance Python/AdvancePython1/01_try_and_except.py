
print("Press q for quit")
while(True):
    num = (input("Enter a number:- "))
    if(num == "q"):
        break
    try:
        num = int(num)
        if(num>10):
            print("Your number is greater than 10")
    except Exception as e:
        print(f"Your input occured an error {e}")

print("Thanks for playing this game!")