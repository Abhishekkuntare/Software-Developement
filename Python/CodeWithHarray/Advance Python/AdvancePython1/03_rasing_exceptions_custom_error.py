
def increment(num):
    try:
        return int(num)+1

    except:
        raise ValueError("This is not good -- abhishek") 
    
        #adding a custom errors 
    
a = increment("dd")
print(a)