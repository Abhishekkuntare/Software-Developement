
from re import sub


sub1 = int(input("Enter your marks in html: "))
sub2 = int(input("Enter your marks in css: "))
sub3 = int(input("Enter your marks in js: "))

grade =(float) ((sub1+sub2+sub3)/3)

if(grade >=90 and grade <=100):
    print("Ex-Grade -  Percentage:",grade)
elif (grade >=80 and grade <=90):
    print("A-Grade-  Percentage:",grade)
elif (grade >=70and grade <=80):
    print("B-Grade -  Percentage:",grade)
elif (grade >=60and grade <=70):
    print("C-Grade - Percentage:",grade)
elif (grade >=50and grade <=60):
    print("D-Grade -  Percentage:",grade)
else:
    print("F-Grade -  Percentage:",grade)