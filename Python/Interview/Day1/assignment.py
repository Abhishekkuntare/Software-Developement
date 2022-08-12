# import math
# #area of circle
# rad = eval(input("Enter the radius: "))
# ans =math.pi * rad *rad;
# print("Area of circle: ",ans)

# #area of reactangle
# l = eval(input("Enter the length: "))
# w = eval(input("Enter the width: "))
# areaOfRec = l *w;
# print("Area of reactangle: ",areaOfRec)

# #area of triangle
# b = eval(input("Enter the breadth: "))
# h = eval(input("Enter the height: "))
# areaOfTri =( 1/2)*(b*h);
# print(areaOfTri)

#calculte monthly salary
Monthly_Salary = 100.00
absent_day_fine = 10.00

absent_days = int(input("Enter the absent days: "))

if(absent_days>0 and absent_days<=10):
    absent_days =(absent_days*absent_day_fine)
    print("Absent days fine:",absent_days,"₹")
    Total_Salary = Monthly_Salary - absent_days
    print("Total Salary:",Total_Salary,"₹")
else:
    print("Invalid days!")
    exit


