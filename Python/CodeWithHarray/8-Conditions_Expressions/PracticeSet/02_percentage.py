
marks1 = int(input("Enter your marks1 subject: "))
marks2 = int(input("Enter your marks2 subject: "))
marks3 = int(input("Enter your marks3 subject: "))

if(marks1<33 or marks2<33 or marks3<33):
    print("You are fail, because you have less than 33% in one of the subject")
elif ((marks1+marks2+marks3)/3 < 40):
    print("You are fail ! beacause you have less than 40%")
else:
    print("Congratulations! you are pass this exam !")