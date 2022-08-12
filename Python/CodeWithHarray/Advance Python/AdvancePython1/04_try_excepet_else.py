try:
    i = input("Enter a number: ")
    i = int(i)
    c = 1/i
    print(c)
except Exception as e:
    print(e)  
# except ValueError as e:
#     print("Input occured an error!") #this is not work

else:
    print("We did this !")

# Note:- if we  use a Exception as e then we do not pass differnt types of error example we do not pass Value error with Exception