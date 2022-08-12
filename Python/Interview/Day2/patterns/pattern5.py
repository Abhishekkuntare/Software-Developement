
a = 5;
for i in range(5,0,-1): #outer loop  / use to print new line 
    for k in range(5,i,-1): # inner loop / print stars 
        print(end=" ")
    for j in range(1,i+1): # inner loop / print stars 
        print("*",end=" ")
    print()