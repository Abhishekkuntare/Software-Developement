

# # #1.wap program find all such a member which are divisible by 7 
# # # but 
# # l1 = [] #create a empty list
# # for i in range(2000,3600):
# #     if(i%7==0 and i%5!=0):
# #         l1.append(i)
# # print("After inserting data:" ,l1)


# # #2.check number present or not and if number is present then count how many times that number is come
# # A = [1,3,4,6,7,7,7]
# # num = int(input("Enter the number: "))
# # if(num in A):
# #     print("Number is Present and it comes",A.count(num),"times")
# # else:
# #     print("Number is not Present")



# # #3.accept from the user and sort it
# # list =[]
# # for i in range(5): 
# #     num = (input("Enter the name: ")) #default is string
# #     list.append(num)

# # print(list)
# # list.sort()
# # print(list)


# name = []
# marks =[]
# for i in range(5):  
#      n = (input("Enter the name: "))
#      m = (eval(input("Enter the marks: ")))
#      name.append(n)
#      marks.append(m)

# print("Name: ",name)
# print("Marks: ",marks)

# minmarks = min(marks)
# maxmarks = max(marks)
# print("Min marks: ",minmarks)
# print("Max marks: ",maxmarks)

# for i in range(5): 
#     if(minmarks== marks[i]):
#         print("Name of min marks student: ", name[i])
#     if(maxmarks==marks[i]):
#         print("Name of max marks student: ", name[i])



li =[3,3,5,6]
n = int(input("Enter a number: "))
index = int(input("Enter the pos: "))
li.insert(index,n)
print(li)
