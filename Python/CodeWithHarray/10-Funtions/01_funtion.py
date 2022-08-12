# 1 - create a funtion 
def percent(marks):
    # return (sum(marks)/400)*100
    p = (sum(marks)/400)*100
    return p
    


#main
marks1 =[12,34,54,67]
percentage = percent(marks1)# 2 -  calling a funtion 
print(percentage)

marks2=[20,84,94,97]
percentage2 = percent(marks2)
print(percentage2)



